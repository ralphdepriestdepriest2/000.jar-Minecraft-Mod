fill ~-1 ~ ~-1 ~1 ~1 ~1 stone_bricks
fill ~ ~ ~ ~ ~1 ~ air
fill ~-1 ~-1 ~-1 ~1 ~-1 ~1 black_wool replace air
setblock ~ ~-2 ~ stone_bricks

scoreboard players remove #width2 maze 1
execute if score #width2 maze matches 1.. positioned ~2 ~ ~ run function maze:build/width