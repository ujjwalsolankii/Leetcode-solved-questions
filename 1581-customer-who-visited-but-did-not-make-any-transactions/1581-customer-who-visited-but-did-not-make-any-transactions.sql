# Write your MySQL query statement below
select visits.customer_id , count(visits.customer_id) as count_no_trans
from visits left join transactions
on Visits.visit_id = Transactions.visit_id
where transaction_id is null
group by customer_id