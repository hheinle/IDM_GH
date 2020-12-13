##1/ Combien y a-t-il de variantes du Uno? 

Si on considère mon Feature Model : 
1536 si on ne considère que les configurations valides (on configure la plus petite configuration possible du Feature Model, dans mon cas, c'est la version classique du UNO, et on regarde le nombre de configurations possibles restantes)

Si on considère le jeu Uno au global :
Il existe une infinité de variantes possibles car il en existe énormément et on peut en créer de nouvelles.

##2/ Inventer un DSL avec une grammaire Xtext qui permet à un utilisateur de spécifier n’importe quelle règle complète du Uno

Les contraintes exprimées dans le feature model ne sont pas exprimées dans la grammaire, on considère que cela sera géré à la compilation
Les règles immuables du Uno, qui ne varient jamais, quelles que soient les variantes ne sont pas précisées dans le Feature Model. (Par exemple, le fait qu'on puisse poser une carte d'une même couleur sur une autre
carte de même couleur...)

##3/ Spécifier en JSON plusieurs règles du Uno et spécifier le schema JSON associé

Je vous ai fourni le schéma JSON ainsi que 5 variantes sous formes de fichiers JSON que j'ai testé (via un validateur en ligne : https://www.jsonschemavalidator.net/). Il y a la variante classique du UNO, une variante valide (le uno 7_0 (voir sur https://fr.wikipedia.org/wiki/Uno#Variantes_de_jeu pour avoir des infos sur cette variante)) et une variante "étrange" mais valide (qui contient le plus de features possibles pour mette le schéma à l'épreuve) qui doivent être validées par le schéma. Il y a aussi deux variantes invalides (donc un JSON vide, sous sa forme minimale {}) qui ne sont pas validées par le schéma

##4/ On souhaite écrire un générateur de règles Uno (pour fournir à des joueurs en début de partie, par exemple pour éviter tout conflit). Comment développeriez-vous ce générateur avec le FM de la Q1, le DSL de la Q2, et le JSON de la Q3?

Pour le FM de la Q1, on pourrait imaginer  un parser XML qui serait validé par le feature model réalisé (lui aussi au format XML). Les règles générées doivent être lisibles et compréhensibles pour un joueur lambda. La couche intermédiaire entre le XML et les règles pourrait être un programme Java qui va lire le XML et générer les règles.

Pour le DSL de la Q2, on peut coder un compilateur de ce DSL en un autre langage qui pourrait être directement utilisé pour générer les règles. Les règles générées doivent être lisibles et compréhensibles pour un joueur lambda.

Pour le JSON de la Q3, on pourrait réaliser un parser JSON qui va traduire le Json en un ensemble de règles qui soient lisibles et comprhénsibles pour un joueur lambda. Pour la validation du JSON, on se basera sur notre schéma JSON réalisé. La couche intermédiaire entre le JSON et les règles pourrait être un programme Java qui va lire le JSON et générer les règles.

##5/ On souhaite transformer un programme écrit dans votre DSL (cf Q2) en fichier JSON (et vice-versa). Comment développeriez-vous cette transformation? 

Pour convertir le DSL en JSON, on pourrait imaginer un systèm d'annotations qui va transformer mon programme écrit dans mon DSL en un data model JSON.

Pour convertir le JSON en DSL, j'utiliserai un parser pour lire mon JSON et créer des fichiers DSL.