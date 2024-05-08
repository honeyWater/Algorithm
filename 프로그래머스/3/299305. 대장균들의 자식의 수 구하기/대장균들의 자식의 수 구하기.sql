select e1.id, count(e2.parent_id) as child_count
from ecoli_data e1
left outer join ecoli_data e2 on e1.id = e2.parent_id
group by e1.id
order by e1.id;