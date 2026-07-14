-- Last updated: 14/07/2026, 16:02:53
SELECT
    player_id,
    MIN(event_date) AS first_login
FROM Activity
GROUP BY player_id;
