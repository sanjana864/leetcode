-- Last updated: 14/07/2026, 16:04:44
SELECT email AS Email
FROM Person
GROUP BY email
HAVING COUNT(*) > 1;
