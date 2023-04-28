select ani.name, ani.datetime
from animal_ins as ani
left join animal_outs as ano
on ani.animal_id = ano.animal_id
where ano.animal_id is null
order by ani.datetime
limit 3;