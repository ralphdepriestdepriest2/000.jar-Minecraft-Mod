scoreboard players operation #width2 maze = #width maze
function maze:build/width

scoreboard players remove #length2 maze 1
execute if score #length2 maze matches 1.. positioned ~ ~ ~2 run function maze:build/length