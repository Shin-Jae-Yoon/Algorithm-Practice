select year(o.sales_date) as year, month(o.sales_date) as month
, count(distinct i.user_id) as puchased_users
, round(
    (count(distinct i.user_id))
    / (select count(*) from user_info where year(joined) = '2021'), 1
    ) as puchased_ratio
from user_info as i
join online_sale as o on i.user_id = o.user_id
where year(i.joined) = 2021
group by year(o.sales_date), month(o.sales_date)
order by year(o.sales_date), month(o.sales_date)