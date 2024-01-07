SELECT /*+ INDEX("STAVKAZAPISNIKA"@"SEL$1" NAZIVKOMPANIJE_INDEX) */   * FROM STAVKAZAPISNIKA 
WHERE NAZIVKOMPANIJE='Nidza +';


CREATE INDEX NAZIVKOMPANIJE_INDEX ON STAVKAZAPISNIKA(NAZIVKOMPANIJE);


SELECT  * FROM NARUDZBENICA 
WHERE KOMPANIJAID=1;


CREATE INDEX NARUDZBENICA_KOMPANIJAID_INDEX ON NARUDZBENICA(KOMPANIJAID);


SELECT  * FROM ZAHTEV 
WHERE NAZIVZAHTEVA='Zahtev za renoviranje WC-a';


CREATE INDEX ZAHTEV_NAZIVZAHTEVA_INDEX ON ZAHTEV(NAZIVZAHTEVA);