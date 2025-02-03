scoreboard objectives add maze dummy
summon armor_stand ~ ~ ~ {CustomName:"{\"text\":\"random\"}",Marker:1,Invisible:1,NoGravity:1,Invulnerable:1,PersistenceRequired:1}
summon armor_stand ~ ~ ~ {CustomName:"{\"text\":\"random\"}",Marker:1,Invisible:1,NoGravity:1,Invulnerable:1,PersistenceRequired:1}
execute at @e[type=armor_stand,name=random] run summon armor_stand ~ ~ ~ {CustomName:"{\"text\":\"random\"}",Marker:1,Invisible:1,NoGravity:1,Invulnerable:1,PersistenceRequired:1}