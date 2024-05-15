select product_code
    , sum(price * sales_amount) as sales
from product p join offline_sale o
using (product_id)
group by product_id
order by sales desc, product_code asc;