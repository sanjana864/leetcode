-- Last updated: 14/07/2026, 16:03:04
# Write your MySQL query statement below
SELECT class
FROM Courses
GROUP BY class
HAVING COUNT(student) >= 5;