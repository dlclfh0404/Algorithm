-- 코드를 입력하세요
SELECT ANIMAL_INS.ANIMAL_ID,ANIMAL_INS.ANIMAL_TYPE, ANIMAL_INS.NAME
FROM ANIMAL_INS
JOIN ANIMAL_OUTS
ON ANIMAL_INS.ANIMAL_ID = ANIMAL_OUTS.ANIMAL_ID
WHERE ANIMAL_INS.SEX_UPON_INTAKE LIKE 'INTACT%'
AND (ANIMAL_OUTS.SEX_UPON_OUTCOME LIKE 'SPAYED%'
OR ANIMAL_OUTS.SEX_UPON_OUTCOME LIKE 'NEUTERED%')
ORDER BY ANIMAL_INS.ANIMAL_ID