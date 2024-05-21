select category, sum(sales) as total_sales
from book b
join book_sales s using (book_id)
where sales_date like '2022-01%'
group by category
order by category;