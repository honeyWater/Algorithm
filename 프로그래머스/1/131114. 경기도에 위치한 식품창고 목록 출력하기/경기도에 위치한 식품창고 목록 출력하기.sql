select WAREHOUSE_ID, WAREHOUSE_NAME, ADDRESS,
    case freezer_yn when 'Y' then 'Y'
                            else 'N'
    end as FREEZER_YN
from food_warehouse
where warehouse_name like '%경기%'
order by warehouse_id;