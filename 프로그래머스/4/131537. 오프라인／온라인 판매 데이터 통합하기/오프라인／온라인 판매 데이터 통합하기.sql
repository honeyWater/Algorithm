select date_format(SALES_DATE, '%Y-%m-%d') as SALES_DATE, PRODUCT_ID, USER_ID, SALES_AMOUNT
from online_sale
where sales_date like '2022-03%'
UNION
select date_format(SALES_DATE, '%Y-%m-%d') as SALES_DATE, PRODUCT_ID, NULL, SALES_AMOUNT
from offline_sale
where sales_date like '2022-03%'
order by sales_date, product_id, user_id;