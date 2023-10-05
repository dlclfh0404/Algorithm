SELECT COUNT(*) as USERS
    FROM USER_INFO
    WHERE TO_CHAR(JOINED, 'YYYY') = '2021'
          AND (AGE >= 20 AND AGE <= 29);