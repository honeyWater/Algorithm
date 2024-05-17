select distinct(item_id) as item_id, item_name
from item_info join item_tree
using(item_id)
where parent_item_id is null
order by item_id