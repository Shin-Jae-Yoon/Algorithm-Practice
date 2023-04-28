select date_format(datetime, '%H') as HOUR, count(*)
from animal_outs
group by HOUR
having HOUR between '09' and '20'
order by HOUR;