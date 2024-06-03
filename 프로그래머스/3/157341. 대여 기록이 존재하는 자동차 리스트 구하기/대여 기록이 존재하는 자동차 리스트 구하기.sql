select distinct(car_id)
from (select car_id
      from car_rental_company_car
      where car_type = '세단') c
join car_rental_company_rental_history using(car_id)
where month(start_date) = 10
order by car_id desc;