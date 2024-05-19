select sum(score) as score
    , emp_no
    , e.emp_name as emp_name
    , e.position as position
    , e.email as email
from hr_employees e
join hr_grade g using(emp_no)
group by year, emp_no
having g.year = 2022
order by score desc limit 1;