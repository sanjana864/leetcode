-- Last updated: 14/07/2026, 16:04:37
DELETE p1
FROM Person p1, Person p2
WHERE p1.email = p2.email
  AND p1.id > p2.id;
