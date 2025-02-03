#Determine available directions
scoreboard players set @e[type=armor_stand,name=random] maze 0
execute if block ~2 ~ ~ stone_bricks run scoreboard players set @e[type=armor_stand,name=random,scores={maze=0},limit=1] maze 1
execute if block ~-2 ~ ~ stone_bricks run scoreboard players set @e[type=armor_stand,name=random,scores={maze=0},limit=1] maze 2
execute if block ~ ~ ~2 stone_bricks run scoreboard players set @e[type=armor_stand,name=random,scores={maze=0},limit=1] maze 3
execute if block ~ ~ ~-2 stone_bricks run scoreboard players set @e[type=armor_stand,name=random,scores={maze=0},limit=1] maze 4

#Select maze direction (if available)
scoreboard players set #random maze 0
scoreboard players operation #random maze = @e[type=armor_stand,name=random,scores={maze=1..},sort=random,limit=1] maze

#Set red_wool if a direction is chosen
execute if score #random maze matches 1.. run setblock ~ ~ ~ red_wool

#Carve out maze in chosen direction (if one is chosen)
execute if score #random maze matches 1 run fill ~1 ~2 ~ ~1 ~3 ~ air
execute if score #random maze matches 1 positioned ~2 ~ ~ run function maze:maze
execute if score #random maze matches 2 run fill ~-1 ~2 ~ ~-1 ~3 ~ air
execute if score #random maze matches 2 positioned ~-2 ~ ~ run function maze:maze
execute if score #random maze matches 3 run fill ~ ~2 ~1 ~ ~3 ~1 air
execute if score #random maze matches 3 positioned ~ ~ ~2 run function maze:maze
execute if score #random maze matches 4 run fill ~ ~2 ~-1 ~ ~3 ~-1 air
execute if score #random maze matches 4 positioned ~ ~ ~-2 run function maze:maze

#Backtrack if there are no available directions
execute if score #random maze matches 0 run setblock ~ ~ ~ blue_wool
execute if score #random maze matches 0 if block ~1 ~2 ~ air if block ~2 ~ ~ red_wool positioned ~2 ~ ~ run function maze:maze
execute if score #random maze matches 0 if block ~-1 ~2 ~ air if block ~-2 ~ ~ red_wool positioned ~-2 ~ ~ run function maze:maze
execute if score #random maze matches 0 if block ~ ~2 ~1 air if block ~ ~ ~2 red_wool positioned ~ ~ ~2 run function maze:maze
execute if score #random maze matches 0 if block ~ ~2 ~-1 air if block ~ ~ ~-2 red_wool positioned ~ ~ ~-2 run function maze:maze