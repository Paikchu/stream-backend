SELECT g.g_id, g.g_name
FROM Game as g
JOIN Library as L on g.g_id = L.g_id
JOIN User U on U.u_id = L.u_id
WHERE U.u_id = 12
