select x.animal_id as animal_id, x.name as name
from (select i.animal_id as animal_id
            , i.name as name
            , datediff(o.datetime, i.datetime) as datetime
     from animal_ins i left outer join animal_outs o 
      on i.animal_id = o.animal_id
     where o.datetime is not null) x
order by x.datetime desc limit 2;