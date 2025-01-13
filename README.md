# Simulatore del gestionale della NASA e lancio razzi bellici
Boubagura Yassin
Del Fabro Mattia
Tincani Lorenzo
## PRESENTAZIONE DEL PROGETTO:
Il progetto dev’essere in grado di far visualizzare due tipologie di interfacce una dedicata all’utente “lavoratore”, ed una all’utente di tipo “amministratore”. Generalmente le due interfacce hanno lo scopo di effettuare varie operazioni come la creazione di razzi, dove è possibile specificare le caratteristiche, impostarne le coordinate di lancio, e accedere ad ulteriori informazioni riguardanti l’uso e le manovre usate riguardanti il lancio dei razzi balistici.
Inoltre, ogni utente, per accedere alle varie funzionalità ad esso dedicate è necessaria l’autenticazione mediante, l’username e password. 
Nel caso in cui l’accesso venga effettuato da un utente di tipo “amministratore”, questo ha anche la possibilità di apportare mod ifiche riguardanti lo stato e le caratteristiche degli utenti “lavoratori”, oltre a gestire attraverso ulteriori funzionalità il comportamento e la gestione dei razzi bellici. Coloro che effettuano l’accesso da utente “lavoratore” avranno la possibilità di gestire e specificare gli usi esclusivamente dei razzi di tipo spaziale.
## REQUISITI FUNZIONALI:
il sistema deve permettere una simulazione di un gestionale della per il lancio di razzi spaziali della Nasa e per il lancio di raggi bellici
al primo accesso nel sistema verrà richiesto di creare un account amministratore e poi di identificarsi tramite un login che andrà a stabilire se si è un lavoratore semplice oppure l’amministratore
una volta che il login sarà avvenuto con successo si dovrà presentare una schermata di menù che fornirà le possibili azioni eseguibili in base al ruolo identificato in fase di login, dato che le azioni saranno differenti in base al tipo di utente
l’amministratore potrà:
- aggiungere lavoratori. 
- eliminare lavoratori.
- visualizzare i dati dei lavoratori. 
- creare razzi bellici. 
- lanciare razzi bellici.
- visualizzare la lista dei razzi con i rispettivi dati, sia dei razzi spaziali sia dei razzi bellici. 
- visualizzare i log.
un lavoratore potrà:
- aggiungere razzi spaziali.
- eliminare razzi spaziali.
- visualizzare i dati dei razzi spaziali.
- visualizzare i dati del proprio profilo. 
un razzo dovrà rispettare un certo tipo di parametri:
- nome del razzo.
- il raggio d’azione del razzo:
    dev’essere uguale ad altezza/10.
- la massa (peso) del razzo:
    dev’essere di almeno 500 kg.
- il numero dei motori che costituisce il razzo:
    il motore può sollevare una massa massima di 500 kg.
- altezza: 
    raggio moltiplicato per 10.
    altezza minima di 60 metri.
- tutte le azioni eseguite nel sistema verranno salvate tramite i log e saranno visualizzabili solo all’amministratore. 
- i login falliti verranno salvati nel log e saranno visualizzabili solo dall’amministratore.
- nel menu di ogni tipo di account verrà fornita l’opzione di logout. 

## REQUISITI NON FUNZIONALI:
- il lavoratore per motivi di privacy deve poter visualizzare solo i suoi dati e non quelli di altri lavoratori.
- l’amministratore può visualizzare i dati di tutti i lavoratori ma non può vedere le loro password. 
- i lavoratori non possono aggiungere o lanciare razzi bellici. 
- l’amministratore per motivi di sicurezza è l’unico ad avere il potere di creare e lanciare razzi bellici. 
- il sistema deve riuscire a girare anche su dispositivi poco performanti.
- il sistema deve riuscire ad essere veloce nell’esecuzione delle richieste da parte degli utilizzatori. 
- il sistema non deve avere un peso eccessivo.


## SCELTE PROGETTUALI
Per lo sviluppo di un sistema informatico che permetta la simulazione di un gestionale della NASA e lancio razzi bellici sono state identificate le seguenti componenti:
- una componente è quella di login che dovrà capire il tipo di utilizzatore che sta cercando di accedere al gestionale
- una componente è quella che contiene i dati del razzo ovvero,  il nome identificativo, usato per il riconoscimento dello stesso, i parametri come raggio, massa, e numero motori sono necessari al fine di specificare l’ uso che si vuole fare del razzo. I parametro sono mutabili in base alla tipologia del razzo.
- una componente è quella che contiene l'insieme dei razzi e ne gestisce l’aggiunta, l’eliminazione e la ricerca
- le coordinate sono un componente necessario alla configurazione dei razzi balistici, le coordinate saranno composte da due punti X e Y
- una componente conterrà i lavoratori con i rispettivi dati che sono: nome utente, password ed id
- Un ulteriore componente sará quella della gestione dei lavoratori tramite un'istanza che permettetterá di aggiungere, rimuovere e modificare un utente
- una componente è quella che gestisce i menù contenenti le azioni eseguibili dagli  dai lavoratori semplici o dall’amministratore 
- una componente è quella dei log che contiene i vari log per l'appunto e ne gestisce il salvamento.