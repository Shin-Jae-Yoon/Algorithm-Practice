-- 대여중인 자동차 정보 car_rental_company_car -> crcr

-- 자동차 대여 기록 car_rental_company_rental_history -> crcrh
-- car_id로 car_rental_company_car와 연결

-- 자동차 종류 별 대여 기간 종류 별 할인 정책 정보 car_rental_company_discount_plan -> crcdp
-- car_type으로 car_rental_company_car 테이블과연결

-- 자동차 종류 '트럭' crcr의 car_type이 트럭
-- 대여 기록(crcrh의 history_id) 별로 group by 한거를 대여금액(fee)
-- crcrh의 대여 기록 ID(history_id)와 crcr의 대여 금액 리스트(daily_fee * 할인율)
-- 대여 금액 기준 desc, 대여 기록 id 기준 desc

select crcrh.history_id as HISTORY_ID,
    case
        when datediff(end_date, start_date) < 7 
            then (datediff(end_date, start_date) + 1) * crcr.daily_fee
        when datediff(end_date, start_date) < 30 
            then (datediff(end_date, start_date) + 1) * round(crcr.daily_fee * 0.95)
        when datediff(end_date, start_date) < 90 
            then (datediff(end_date, start_date) + 1) * round(crcr.daily_fee * 0.92)
        else (datediff(end_date, start_date) + 1) * round(crcr.daily_fee * 0.85)
        end as FEE
from car_rental_company_car as crcr
join car_rental_company_rental_history as crcrh on crcr.car_id = crcrh.car_id
join car_rental_company_discount_plan as crcdp on crcr.car_type = crcdp.car_type
where crcr.car_type = '트럭'
group by crcrh.history_id
order by FEE desc, HISTORY_ID desc;