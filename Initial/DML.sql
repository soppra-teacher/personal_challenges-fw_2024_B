--
--ユーザマスタ
--
INSERT INTO JSSSYSTEM.MST_USER (USER_ID, USER_NAME, PASSWORD, LOGIN_DATE, TEACHER_FLG) VALUES ('1', 'TEACHER', '1', SYSDATE, '1');
INSERT INTO JSSSYSTEM.MST_USER (USER_ID, USER_NAME, PASSWORD, LOGIN_DATE, TEACHER_FLG) VALUES ('2', 'STUDENT', '2', SYSDATE, '0');
--
--分類マスタ
--
INSERT INTO JSSSYSTEM.MST_CATEGORY(CATEGORY_ID, SUBJECT, CATEGORY) VALUES ('C000000001', 'Java', '変数宣言');
INSERT INTO JSSSYSTEM.MST_CATEGORY(CATEGORY_ID, SUBJECT, CATEGORY) VALUES ('C000000002', 'Java', '演算子');
INSERT INTO JSSSYSTEM.MST_CATEGORY(CATEGORY_ID, SUBJECT, CATEGORY) VALUES ('C000000003', 'Java', '配列');
INSERT INTO JSSSYSTEM.MST_CATEGORY(CATEGORY_ID, SUBJECT, CATEGORY) VALUES ('C000000004', 'Java', '型変換');
INSERT INTO JSSSYSTEM.MST_CATEGORY(CATEGORY_ID, SUBJECT, CATEGORY) VALUES ('C000000005', 'Java', '継承');
INSERT INTO JSSSYSTEM.MST_CATEGORY(CATEGORY_ID, SUBJECT, CATEGORY) VALUES ('C000000006', 'Java', 'インターフェース');
INSERT INTO JSSSYSTEM.MST_CATEGORY(CATEGORY_ID, SUBJECT, CATEGORY) VALUES ('C000000007', 'Java', 'メソッド');
INSERT INTO JSSSYSTEM.MST_CATEGORY(CATEGORY_ID, SUBJECT, CATEGORY) VALUES ('C000000008', 'Java', '繰り返し');
INSERT INTO JSSSYSTEM.MST_CATEGORY(CATEGORY_ID, SUBJECT, CATEGORY) VALUES ('C000000009', 'Java', 'インスタンス');
INSERT INTO JSSSYSTEM.MST_CATEGORY(CATEGORY_ID, SUBJECT, CATEGORY) VALUES ('C000000010', 'Java', 'カプセル化');
INSERT INTO JSSSYSTEM.MST_CATEGORY(CATEGORY_ID, SUBJECT, CATEGORY) VALUES ('C000000011', 'SQL', 'SQLについて');
INSERT INTO JSSSYSTEM.MST_CATEGORY(CATEGORY_ID, SUBJECT, CATEGORY) VALUES ('C000000012', 'SQL', '検索結果の加工');
INSERT INTO JSSSYSTEM.MST_CATEGORY(CATEGORY_ID, SUBJECT, CATEGORY) VALUES ('C000000013', 'SQL', '関数');
INSERT INTO JSSSYSTEM.MST_CATEGORY(CATEGORY_ID, SUBJECT, CATEGORY) VALUES ('C000000014', 'SQL', '副問い合わせ');
INSERT INTO JSSSYSTEM.MST_CATEGORY(CATEGORY_ID, SUBJECT, CATEGORY) VALUES ('C000000015', 'SQL', '基本文法');
INSERT INTO JSSSYSTEM.MST_CATEGORY(CATEGORY_ID, SUBJECT, CATEGORY) VALUES ('C000000016', 'SQL', '比較演算子');
INSERT INTO JSSSYSTEM.MST_CATEGORY(CATEGORY_ID, SUBJECT, CATEGORY) VALUES ('C000000017', 'SQL', '条件式');
INSERT INTO JSSSYSTEM.MST_CATEGORY(CATEGORY_ID, SUBJECT, CATEGORY) VALUES ('C000000018', 'SQL', 'グループ化');
INSERT INTO JSSSYSTEM.MST_CATEGORY(CATEGORY_ID, SUBJECT, CATEGORY) VALUES ('C000000019', 'SQL', 'テーブルの結合');
INSERT INTO JSSSYSTEM.MST_CATEGORY(CATEGORY_ID, SUBJECT, CATEGORY) VALUES ('C000000021', 'Java', 'その他');
INSERT INTO JSSSYSTEM.MST_CATEGORY(CATEGORY_ID, SUBJECT, CATEGORY) VALUES ('C000000022', 'SQL', 'その他');
--
--解答解説マスタ
--
INSERT INTO JSSSYSTEM.MST_ANSWER VALUES ('A47','c','a) WHERE sysdate - hire_date <= 60
この式は、現在の日付（sysdate）から入社日（hire_date）を引いて、その差が60以下であるかどうかをチェックしています。正しい選択肢ではありません。

b) WHERE ADD_MONTHS(hire_date, 60) <= sysdate
この式は、入社日から60ヶ月後の日付を計算し、それが現在の日付（sysdate）以下であるかどうかをチェックしています。正しい選択肢です。

c) WHERE MONTHS_BETWEEN(hire_date, sysdate) <= 60
この式は、入社日と現在の日付の間の月数を計算し、その差が60以下であるかどうかをチェックしています。正しい選択肢です。

d) WHERE MONTHS_BETWEEN(sysdate, hire_date) <= -60
この式は、現在の日付と入社日の間の月数を計算し、その差が-60以下であるかどうかをチェックしています。正しくありません。',NULL,SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_ANSWER VALUES ('A16','c','FileクラスのlistFile()メソッドは、ディレクトリ内の抽象パス名をFile型の配列で返す。Fileクラスのlist()メソッドはディレクトリ内のエントリを持つ要素に持つStreamを返す。',NULL,SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_ANSWER VALUES ('A17','c','if (i > 7)で、8以上をはじいて(i%2==0)で奇数をはじくif(i>0)では0より小さい数字をはじくループ処理',NULL,SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_ANSWER VALUES ('A22','d','var a;は初期値を指定せずに、varを使用しているため。
var b=null;は推論できないため
var d={1,2,3};は配列の初期化では明示的な型が必要なため。
',NULL,SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_ANSWER VALUES ('A24','a','0?4までの数字を順に表示したいため、System.out.println(b);になっており、bの値が5より小さくなければ最初のfor文は通らないため。',NULL,SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_ANSWER VALUES ('A31','c',NULL,NULL,SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_ANSWER VALUES ('A32','a','ビューをインサート対象として指定することはできません。理由は、ビューは仮想的なテーブルであり、物理的なデータを格納していないためです。ビューはクエリの結果を表示するために使用され、データの実際の格納場所ではありません。したがって、ビューを直接インサート対象として指定することはできません。

もしビューのデータをテーブルに挿入したい場合、ビューの元となるテーブルからデータを取得してINSERT文を実行する必要があります。',NULL,SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_ANSWER VALUES ('A33','a',NULL,NULL,SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_ANSWER VALUES ('A34','a','ALTER TABLEコマンドを使用して、既存のテーブルに対して列にデフォルト値を設定することは可能です。以下の理由で実行可能です。

1. **デフォルト値の設定**:
    ```sql
    ALTER TABLE テーブル名
    ALTER COLUMN 列名 SET DEFAULT デフォルト値;
    ```
    このコマンドは、既存のテーブルの指定された列にデフォルト値を設定します。これにより、新しい行が挿入される際に、デフォルト値が自動的に使用されます。

2. **既存の行へのデフォルト値の適用**:
    既存のテーブルに1000行のデータがある場合、デフォルト値を設定した後、既存の行にデフォルト値を適用する必要があります。これは、ALTER TABLEコマンドで直接実行できる操作ではありませんが、次の手順で実行できます。

    - 一時的な新しい列を追加してデフォルト値を設定します。
    - 既存のデータを更新して、新しい列にデフォルト値をコピーします。
    - 必要なデータを確認した後、元の列を削除します。

注意: データベースの種類やバージョンによっては、ALTER TABLEコマンドのサポートや構文が異なる場合があります。具体的なデータベースシステムのドキュメントを参照してください。 

どちらの方法も、データベースの設計と要件に合わせて選択できます。',NULL,SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_ANSWER VALUES ('A35','d',NULL,NULL,SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_ANSWER VALUES ('A36','b','照整合性制約の参照先テーブルを指定するための句
使用方法は以下
外部キーを持つテーブルを作成するには、
FOREIGN KEY(列名) REFERENCES 親テーブル名(親列名)

EXECUTE は、事前に作成されたプリペアド文を実行する際に使用します。 
プリペアド文はセッション中にしか存在できないため、
事前に同一セッション中の PREPARE 文によって作成されたものでなければなりません。',NULL,SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_ANSWER VALUES ('A37','a','表示する項目は仕入テーブルの全項目で、納期の降順でソートされます。また、「単位」の抽出条件に関しては副問い合わせを使用します。',NULL,SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_ANSWER VALUES ('A43','b','ORDER BY が並び替えるソートであるため昇順はASC、降順は DESC',NULL,SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_ANSWER VALUES ('A38','a',NULL,NULL,SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_ANSWER VALUES ('A39','b','下記がそれぞれの使い方です
CONCAT...SELECT CONCAT(【文字列1】, 【文字列2】,【文字列3】,…)
  FROM 【テーブル名】
CAST...CAST(変換前の値 AS 変換するデータの型)
REPLACE...REPLACE(文字列, 置換対象, 置換後)',NULL,SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_ANSWER VALUES ('A40','c',NULL,NULL,SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_ANSWER VALUES ('A41','a','設問のSQLは単一行ファンクションをネストしています。ネスト構造の場合、内側にあるTRIMファンクションが最初に実行されるため',NULL,SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_ANSWER VALUES ('A42','c',NULL,NULL,SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_ANSWER VALUES ('A44','a','REPLACE関数は文字列の一部を文字列に置換する関数です。',NULL,SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_ANSWER VALUES ('A45','d',NULL,NULL,SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_ANSWER VALUES ('A46','d',NULL,NULL,SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_ANSWER VALUES ('A48','a','エラーが発生している理由は、副問い合わせのSELECT句で複数の列を返しているためです。
スペルミス: GROPU BY の部分は GROUP BY と正しく記述する必要があります。副問い合わせは1つの列しか返すことができません。平均給与を求める際には、単一の列を指定する必要があります??。
',NULL,SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_ANSWER VALUES ('A49','c','索引は、表または表クラスタに関連するオプションの構造であり、索引によってデータ・アクセスを高速化できる場合があります。表の1つ以上の列に索引を作成することによって、場合によって、ランダムに分散している行の小さなセットを表から取得できるようになります。索引は、ディスクI/Oを削減するための様々な手段のうちの1つです。',NULL,SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_ANSWER VALUES ('A50','b','UNION ：２つの問い合わせ結果のレコードが 同じ内容であった場合、重複行は削除して 結果にする (≒ SQL の DISTINCT 処理)。重複データのない和集合。
UNION ALL ：２つの問い合わせ結果のレコードが 同じ内容であっても重複行も含める 結果にする。重複データを許す和集合。
',NULL,SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_ANSWER VALUES ('A11','b','数値比較処理を関数で作成する問題で引数の値を比較し、関数の戻り値として、真偽を設定できるように関数宣言しています。',NULL,SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_ANSWER VALUES ('A12','a','try-with-resources文を実装できるのは、java.io.Closeable、java.lang.AutoCloseableの実装クラス。',NULL,SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_ANSWER VALUES ('A13','c','SQLExeption→データベース・アクセス時にエラーがあった場合に発生。
IOExeption→入出力を行う場合い発生。
illegalStateExeption→メソッドの呼び出しが正しくない状態で行われた場合に発生。
Exeption→なし',NULL,SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_ANSWER VALUES ('A20','d','ラベル記述だと、上のa～cですね。暗記問題なので頑張りましょう。',NULL,SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_ANSWER VALUES ('A21','d','なんと、a～cがダメなんですね…
基本的な配列の宣言方法から学びなおすのもいいのかもしれません...',NULL,SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_ANSWER VALUES ('A25','a',NULL,NULL,SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_ANSWER VALUES ('A9','d',NULL,NULL,SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_ANSWER VALUES ('A14','c','まず、ラムダ式とは構文の冗長性を解消するためのもので、
構文は
（実装するメソッドの引数）->{処理}となっている。',NULL,SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_ANSWER VALUES ('A15','d','java.baseモジュールはrequiresを明示しなくても、すべてのモジュール宣言で暗黙的にrequiresとなる。',NULL,SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_ANSWER VALUES ('A3','a','System.out.println(i++);この時点では50　System.out.println(++i);ここの時点で52　System.out.println(++i + 10);ここで63になる',NULL,SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_ANSWER VALUES ('A5','a',NULL,NULL,SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_ANSWER VALUES ('A1','d','byteはとても小さな整数でshortは小さな整数intは普通の整数になっており、longが大きな整数となっているため。',NULL,SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_ANSWER VALUES ('A2','a',NULL,NULL,SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_ANSWER VALUES ('A4','c',NULL,NULL,SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_ANSWER VALUES ('A6','c','staticは同じクラスから生成された複数のインスタンスで1つのフィールドを共有したい場合にはフィールドの先頭にstaticキーワードをつける。
voidはreturnで戻り値を渡す際(例えば、100ならint、"hello"のような文字列型を戻す場合はStringなど...)に外され何も戻さない場合はvoidを指定する。
finalは、その内容がプログラムの動作中に書き換わる必要のない変数のことで、finalつきで宣言された変数は定数と呼ばれる。
abstractは抽象メソッドに用いられるものです。',NULL,SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_ANSWER VALUES ('A7','a',NULL,NULL,SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_ANSWER VALUES ('A8','b','abstractは、抽象メソッドにおいて使用される。なお、抽象クラスは、newによるインスタンス化が禁止となっている。インターフェースは複数、継承(extends)することができる。
finallyはtry-catchの構文に用いられ、例外発生を問わず必ず実行される際に使用される。finallyは常に動く処理と覚えておこう！',NULL,SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_ANSWER VALUES ('A18','b',NULL,NULL,SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_ANSWER VALUES ('A23','c',NULL,NULL,SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_ANSWER VALUES ('A30','c',NULL,NULL,SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_ANSWER VALUES ('A51','a',NULL,NULL,SYSDATE,'1',NULL,NULL);
--
--問題マスタ
--
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q15','C000000007','A16','pathインターフェースのlistFile()','FileクラスのlistFile()','Fileクラスのlist()','Fileクラスのfind()','java.io.FileクラスのlistFiles()メソッドと近い機能を提供するメソッドとして正しいものはどれですか','メソッド?高難易度問題?','0',SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q18','C000000001','A22','var a;','var b=null;','var d={1,2,3};','var e=new ArrayList<>();','次の変数宣言のうち、コンパイルエラーにならないものはどれか','変数宣言の問題！','0',SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q20','C000000008','A24','b<5','5>b','a<5','a>5','0?4までの数字を順に表示したい。
(ア)に入る適切なコードはどれですか？
public class free2 {
    public static void main(String[] args) {
        int a =11;
        int b =0;
        while((ア)) {
            if(5 < a) {
               System.out.println(b);
            }
           a--;
           b++;
        }
    }
}','while文問題！','0',SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q30','C000000011','A30','ファイル','テーブル','リレーショナルデータベース','フィールド','次の文章の空白部を答えてください。データベースの中でも複数の表の形式でデータを管理するものを（あ）といいます。','SQLの基本的な問題','0',SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q31','C000000014','A31','ORDERR BY 句では、最後の副問合せに含まれる列名や列別名で指定する。','ORDER BY 句でソート列を指定は、必ず列の位置で指定する必要がある。','ORDER BY句でソート列を列名や列別名で指定する場合は、最初の問合せの列名や列別名のみ認識される。','複合問合せの各問合せには独自のORDER BY句を書いてもエラーぬはならないが、最後のORDER BY句のみが有効となる。','副問合せにおける、ORDER BY句の使用について正しい記述はどれですか。','副問合せにおける、ORDER BY句について学ぼう','0',SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q32','C000000022','A32','インサート対象として、ビューを指定することはできない。','インサート対象として、索引構成表を指定することはできない。','副問合せ対象として、ビューを指定することができない。','副問合せ対象として、索引構成表を指定することはできない。','複数表のINSEERT文（マルチテーブル・インサート）関して、正しい記述はどれか。','INSEERT文についての応用','0',SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q33','C000000022','A33','主キー列にNULL値に入力することはできない。','一意キー列にNULL値は入力することはできない。','一意キー列にNULL値は1行のみなら挿入できる。','外部キー列にNULL値を入力することはできない。','リレーショナル・データベースのキーについて正しい記述はどれですか。','リレーショナル・データベースについて','0',SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q34','C000000022','A34','列にデフォルト値は設定する。','すべての行を切り捨てる。','VARCHAR2型からNUMBER型に変更する。','１つの行を切り捨てる。','すでに1000行の行データを持つ既存の表に対してALTER TABLEコマンドで実行可能な操作はどれですか。','ALTER TABLEの学習','0',SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q35','C000000011','A35','UNDOが残っている間であれば、列の削除をロールバックすることができる。','UNDOが残っている間であれば、未使用に設定した列を取り戻すことができる。','pa-jiされいなければ、削除した列をごみ箱(RECYCLEBUN)からリカバリできる。','未使用に設定した列を使用可能に戻すことはできない。','列の削除に関して正しい記述はどれですか。','トランザクション処理について','0',SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q36','C000000022','A36','REFERENCESはシーケンスに対して付与できる。','UPDATEの権限を付与する時、表またはビューの列を指定できる。','SELECTの権限を付与する時、表またはビューの列を指定できる。','EXECUTEは、プロシージャに対して付与できない。','オブジェクト権限の付与に関して正しい記述はどれですか。','オブジェクト権限','0',SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q37','C000000014','A37','品目コード IN (SELECT 品目コード FROM 品目マスタ WHERE 単位 = ''個'')	','品目コード = (SELECT 品目コード FROM 品目マスタ WHERE 単位 = ''個'')','品目コード SELECT 品目コード　FROM 品目マスタ WHERE 単位 = ''個''','品目コード IN(SELECT 品目コード,単位 FROM 品目マスタ WHERE　単位 = ''個'')','品目マスタの「単位」が "個"の品目の2022年4月発注日分仕入データを取得する アに入る解答はどれか	
表示する項目は仕入テーブルの全項目とし、「納期」の遅い順にソートすること。	
また、「単位」の抽出条件に関しては副問い合わせを使用すること。

SELECT
  * 
FROM
  仕入テーブル 
WHERE
  ア 
  AND 発注日 >= TO_DATE(''2022/04/01'', ''YYYY/MM/DD'') 
  AND 発注日 <= TO_DATE(''2022/04/30'', ''YYYY/MM/DD'') 
ORDER BY
  納期 DESC	
','条件問題！','0',SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q38','C000000015','A38','INSERT INTO　品目マスタ (品目コード , 品名 , 単位 , 単価)　VALUES ( ''A000022'' , ''ネジ'' , ''個'' , 200 );','INSERT 品目マスタ　INTO　(品目コード , 品名 , 単位 , 単価)　VALUES ( ''A000022'' , ''ネジ'' , ''個'' , 200 );','INSERT INTO　品目マスタ　(品目コード = ''A000022'' , 品名 = ''ネジ'' , 単位 = ''個'' , 単価 =  200)','INSERT INTO　品目マスタ (品目コード , 品名 , 単位 , 単価) = ( ''A000022'' , ''ネジ'' , ''個'' , 200 );','テーブルに新たに１レコード追加するSQL文を記載されているのはどれか。登録するデータは以下の通りとする。','INSERT文について','0',SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q39','C000000013','A39','品名 = CONCAT(単価 + ''円''　AS　VARCHAR2(6))','品名 = CAST(単価 AS VARCHAR2(6)) || ''円''','品名 = CASE(単価 AS VARCHAR2(6)) || ''円''','品名 = REPLACE (単価 AS VARCHAR2(6)) || ''円''','仕入テーブルのレコードのうち、単価が4桁未満のレコードの品名を更新するSQL文を記載してください。											
変更後の品名はそのレコードの単価 + ''円''とすること。ただし、品名のレコードの単価は、明示的な型変換を行うこと。											

UPDATE 仕入テーブル 
SET
  ア 
WHERE
  LENGTH(単価) < 4;','明示的な型変換','0',SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q40','C000000017','A40','SELECT * FROM 経費マスタ WHERE (項目 = ''消耗品費'' AND 経費 <= 3000) AND (項目 = ''旅費交通費'' AND 経費 >= 6000);','SELECT * FROM 経費マスタ WHERE (項目 = ''消耗品費'' AND 経費 => 3000) OR (項目 = ''旅費交通費'' AND 経費 <= 6000);','SELECT * FROM 経費マスタ WHERE (項目 = ''消耗品費'' AND 経費 <= 3000) OR (項目 = ''旅費交通費'' AND 経費 >= 6000);','SELECT * FROM 経費マスタ WHERE (項目 = ''消耗品費'' AND 経費 <= 3000) AND (項目 = ''旅費交通費'' AND 経費 >= 6000);','登録されているデータの中から、項目が消耗品費で、経費が3000以下のレコード、または、項目が旅費交通費で、経費が6000以上のレコードを取得するSQL文を記載されているものはどれか。','条件式について学ぼう','0',SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q43','C000000022','A42','1つ目の問合せでは戻されるが、2つ目の問合せでは戻されない一意の行のみが返される。','複合問合せに含まれる各問合せの順番を入れ替えたら、出力結果は変わる。','内部的にソートが行われる。','選択列に含まれるNULLは無視される。','INTERSECT 演算子による複合問合せについて正しい記述はどれですか。','INTERSECT','0',SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q42','C000000022','A41','AYZ?AY?A','AYZAYA','AYZ?XY?X','AYZ?AY?A?','次の問題を確認してください。
SELECT
  REPLACE (TRIM(TRAILING ''?'' FROM ''xyz?xy?x??''), ''x'', ''A'') 
FROM
  dual;
どのような結果が返されますか。','難問！','0',SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q45','C000000012','A45','MINUS','UNION','REPLACE','INTERSECT','積集合を求める演算子を答えよ。','演算子を覚えてね。','0',SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q46','C000000011','A46','()と{}と[]を使用して、式内の算術演算子のデフォルトの優先順位を変更できる','NULLは式内の算術演算子の優先順位に影響を与える',' +と-のみを含む式では、カッコがない場合、+が優先される',' 優先度が等しい算術演算子は、カッコがない場合、左から右に評価される','算術演算子の優先順位にのルールについて正しいものはどれか。','演算子を学ぼう','0',SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q10','C000000007','A11','ア、ture 　イ、true','ア、ture 　イ、false','ア、false 　イ、false',' ア、false 　イ、true',' public class test{
	public static void main(String[] args) {
	
		// Scannerクラスのインスタンスを作成
		Scanner scanner = new Scanner(System.in);
	
		// 入力
		System.out.println("１回目の数値入力");
		int input_num1 = scanner.nextInt()
		
		System.out.println("２回目の数値入力");
		int input_num2 = scanner.nextInt();

                // 入力値判定
		if ( numCompare(input_num1 , input_num2) ) {
		    System.out.println("１回目の値は、２回目の値より大きいです。");
		}else {
		    System.out.println("１回目の値は、２回目の値以下です。");
		}
	}

	// 入力値判定関数
	public static Boolean numCompare(int input_a_num1 ,int input_a_num2) {
		// 引数１のほうが大きいか判定
		if ( input_a_num1 > input_a_num2 ) {
		    return ア;
		}else {
		    return イ;
		}
        }
}

ア、イの組み合わせで正しいものはどれか
','関数の問題！','0',SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q12','C000000021','A13','SQLExeption','IOExeption','illegalStateExeption','Exeption','実行時例外クラスは次のうちどれですか','応用例外！','0',SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q21','C000000021','A20','代入','return文','tryブロック','a～cのすべて','次の中からラベル記述ができるものを選びなさい','ラベル記述ってなぁ～に？','0',SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q22','C000000001','A21','int b[2];','int [2]c[]','int d[3][];','選択肢 a～cまですべて誤り','配列型変数の宣言として、正しいものを選びなさい','配列型変数宣言','0',SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q24','C000000001','A25','アクセス修飾子がデフォルトのままのフィールドは、すべてのサブクラスのメソッドからアクセスできる','アクセス修飾子がprivateなメッソドであっても、サブクラスからは利用できる','サブクラスであっても、コンストラクタは引き継がない','アクセス修飾子がprotectedなメッソドには、同じパッケージに属するサブクラスのみアクセスできる',' 継承問題！ 
正しいものを選んでください','継承とは？？？？？','0',SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q47','C000000017','A47','WHERE sysdate - hire_date <= 60','WHERE ADD_MONTHS(hire_date,60) <= sysdate','WHERE MONTHS_BETWEEN(hire_date, sysdate) <=60','WHERE MONTHS_BETWEEN(sysdate, sysdate) <=60','あなたは、入社日（hire_date)が過去60カ月以内の行を表示しようと考えています。
どのWHERE句を使用しますか。','WHERE句の復習','0',SYSDATE,' 1 ',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q48','C000000015','A48','   SELECT    MIN(AVG(salary))   FROM    employees   GROUP BY    job_id; ','   SELECT    ANG(MIN(salary))   FROM    employees； ','   SELECT    job_id    , MIN(AVG(salry))   FROM    employees GROPU BY    job_id; ','   SELECT    job_id    , AVG(MIN(salry))   FROM    employees GROPU BY    job_id; ',' 実行してエラーにならない問合わせはどれか。 ',' 文法を覚えよう ','0',SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q49','C000000022','A49',' 存続の一意検引を非一意索引に変更できる。 ',' DROP TABLE文で表がRECYCLE BINに移ると、その表に定義されていた索引はすべてUNUSABLEになる。 ',' 表と策引は常に同じスキーマに属するとは限らない。',' 索引列の列値を更新した後、それを索引エントリに反省するには手動で再構築する必要がある。 ',' 検引について正しい記述はどれですか？',' 検引について学ぼう ','0',SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q50','C000000012','A50',' UNION ALL をUNIONに置き換えると、出力される行数が増える可能性がある。 ',' UNION ALL では出力はソートされる。 ',' UNION ALL では重複行は排除される。 ',' UNIONでは、複合問い合わせに含まれる各問合せに共通するデータを戻す。','UNION 演算子とUNION ALL演算子について正しい記述はどれですか。 ',' UNIONを覚えよう ','0',SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q44','C000000013','A44','REPLACE (品目コード, SUBSTR(品目コード, 1, 1), '' B '') ','SUBSTR(品目コード, REPLACE (品目コード, 1, 1), '' B '') ','REPLACE ( 品目コード, SUBSTR(品目コード, 1, 0, '' B '') ','SUBSTR(品目コード, REPLACE (品目コード, 1, 0), '' B '') ',' 発注計画テーブルの品目コードの先頭1文字をBに置き換えて取得するSQL文を表示する項目は品目コードのみとし、品目コード (昇順) でソートすること。
アに入る解答はどれか
SELECT ア FROM 発注計画テーブル ORDER BY品目コード; ',' 関数問題 ','0',SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q41','C000000012','A43','GROUP BY','ORDER BY','ORDER ','OFFSET 0 ROWS ',' 発注計画テーブルに登録されている全データから、単価が350未満のレコードを取得するSQL文を記載してください。表示する項目は品名、数量、単価、発注日、納期とし、発注日(昇順) でソートすること。ア　に入る解答はどれか
SELECT 品名, 数量, 単価, 発注日, 納期FROM 発注計画テーブル WHERE単価 < 350 ア 発注日; ',' 並び替え問題！ ','0',SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q13','C000000021','A14','() -> ','x, y -> x * y ','(Fool) -> { return;} ','(Foo f1, f2) -> 0 ',' ラムダ式の記述方法として正しいものはでれですか',' 解いてみよう！ラムダ式 ','0',SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q14','C000000021','A15',' jav.basicモジュール ',' java.seモジュール ',' java.langモジュール ',' java.baseモジュール ',' Java SEが提供するモジュールのうち、すべてのモジュール宣言で暗黙的にrequiresとなるモジュールは次のどれですか1つ選択してください',' 解いてみよう！モジュール編 ','0',SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q9','C000000002','A9','[2] と [3] ','[3] と [3] ','[4] と [3] ','[3] と [2] ','public void main(String[] args){
   Test005_Q03_samplesample_A = new Test005_Q03_sample()
   Test005_Q03_sample sample_B = sample_A; 
   sample_A.y = sample_A.x ++; 
   sample_A.printMessage();
} 

public class Test005_Q03_sample { 

   int x = 2;
   int y = 0; 
   
   public void printMessage() { 
     System.out.println("ｘ" + x + "　" + "y：" + y);
     x++;
   }
} 

printMessageを使用したときに出力する変数 [x] と [y] の値を選べ 
',' インクリメント演算子 ','0',SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q1','C000000001','A1','byte < long < int < short ','short < byte < int < long ','short < int< byte < long ','byte < short < int < long ',' 整数のデータ型が大きい順に並んでいるものはどれか ','整数のデータ型の問題 ','0',SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q3','C000000002','A3',' 63 ',' 62 ',' 64 ',' 65 ','下記の順でプログラムを実行した場合、インクリメントについて出力されるウの値を選択して答えよ											
		※出力するiに対して加算させていくこと											
			int  i = 50;										
		ア	System.out.println(i++);										
		イ	System.out.println(++i);										
		ウ	System.out.println(++i + 10);										
		エ	System.out.println(i++ + 10);	',' インクリメント演算子の問題 ','0',SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q2','C000000003','A2',' length ',' main ',' String ',' else ',' 配列の要素数を取得する際に用いられるもので配列の元々宣言されているフィールドの変数名を答えよ',' 配列の問題 ','0',SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q4','C000000002','A4','+ 5 ','num1 ','num1 + 5 ','++ 5 ',' 変数num1 にプラス5した値を変数num2に代入するのに適切なものを選んでください。
 public class Test001_Q04 {
	public static void main(String [] args) { 
           int num1; 
           int num2; 
           num1 = 1; 
           num2 = ア
           System.out.println(num1); 
           System.out.println(num2);
        }
}',' 変数の問題 ','0',SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q5','C000000004','A5',' Integer.parseInt ',' next.LIne() ',' java.util.Scanner ',' next.Int () ','文字列から数値型への型変換を行う適切なプログラムを選べ ',' 型変換の問題 ','0',SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q6','C000000005','A6','static ','void ','final ','abstract ',' Javaにおいて、宣言に（ア）がついているクラスは継承できませんなにがついていると継承できないでしょうか',' 継承における宣言 ','0',SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q7','C000000003','A7','ArrayIndexOutOfBoundsException ','Unresolved compilation problem ','ArrayIndexOfBoundsException ','Unresolved problem ',' 配列で格納データ取得した際に想定されている要素数の範囲外を指定した場合に発生する実行時例外を答えよ',' 実行時例外 ','0',SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q8','C000000006','A8','abstract ','implements ','extends ','finally ',' インターフェースを親とする子クラスの定義に用いるものはどれか',' インターフェース！ ','0',SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q17','C000000002','A18','== ','!= ','> ','< ',' 左辺と右辺が異なる、関係演算子を答えよ ','関係演算子！ ','0',SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q23','C000000005','A23',' アクセス修飾子がデフォルトのままのフィールドは、すべてのサブクラスのメソッドからアクセスできる',' アクセス修飾子がprivateなメソッドであっても、サブクラスからは利用できる ',' サブクラスであっても、コンストラクタは引き継がない',' アクセス修飾子がprotectedなメソッドには、同じパッケージに属するサブクラスのみアクセスできる ','継承の説明として正しいものを選びなさい ',' 継承とは？？？？？ ','0',SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q16','C000000008','A17','*','/','%','+','実行イメージ通りになるように、if文の中の条件(ア)を完成させない[実行イメージ]246

public class Test001_Q10 {
	public static void main(String[] args) {
		for (int i = 0; 0 <= 10; i++) {
			if (i > 7) {
				break;
			} else if (i (ア) 2 == 0) {
				if (i > 0) {
					System.out.print(i);
				}
			}
		}
	}
}','繰り返し！','0',SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q11','C000000021','A12','Closeable','Exeption','Serializable','RuntimeExeption','(ア)に入る正しいクラス名はどれですか？
(ア)を実装したクラスは、try-with-resources文を実装できる','応用問題','0',SYSDATE,'1',NULL,NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q51','C000000001','A51','a','a','q','q','s','ff','1',SYSDATE,'1',NULL,NULL);
