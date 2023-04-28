select ani.animal_id, ani.name
from animal_ins as ani
left join animal_outs as ano
on ani.animal_id = ano.animal_id
where ani.datetime > ano.datetime
order by ani.datetime asc;