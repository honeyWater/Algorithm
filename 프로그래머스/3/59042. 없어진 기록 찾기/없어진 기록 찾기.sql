select o.animal_id, o.name
from animal_outs o left outer join animal_ins i using(animal_id)
where o.datetime is not null and i.datetime is null
order by animal_id;