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
INSERT INTO MST_ANSWER VALUES ('A16', 'c', NULL, NULL, '2024/06/12 16:28:48', '1', NULL, NULL);
INSERT INTO MST_ANSWER VALUES ('A17', 'c', 'if (i > 7)で、8以上をはじいて(i%2==0)で奇数をはじくif(i>0)では0より小さい数字をはじくループ処理', NULL, '2024/06/12 16:38:01', '1', NULL, NULL);
INSERT INTO MST_ANSWER VALUES ('A22', 'c', NULL, NULL, '2024/06/13 10:32:01', '1', NULL, NULL);
INSERT INTO MST_ANSWER VALUES ('A24', 'a', NULL, NULL, '2024/06/13 10:38:23', '1', '2024/06/13 10:48:39', '1');
INSERT INTO MST_ANSWER VALUES ('A30', 'c', NULL, NULL, '2024/06/12 14:31:00', '1', NULL, NULL);
INSERT INTO MST_ANSWER VALUES ('A31', 'c', NULL, NULL, '2024/06/13 11:56:00', '1', NULL, NULL);
INSERT INTO MST_ANSWER VALUES ('A32', 'a', NULL, NULL, '2024/06/13 12:00:00', '1', NULL, NULL);
INSERT INTO MST_ANSWER VALUES ('A33', 'a', NULL, NULL, '2024/06/13 13:18:00', '1', NULL, NULL);
INSERT INTO MST_ANSWER VALUES ('A34', 'a', NULL, NULL, '2024/06/13 13:21:00', '1', NULL, NULL);
INSERT INTO MST_ANSWER VALUES ('A35', 'd', NULL, NULL, '2024/06/13 13:24:00', '1', NULL, NULL);
INSERT INTO MST_ANSWER VALUES ('A36', 'b', NULL, NULL, '2024/06/13 13:37:00', '1', NULL, NULL);
INSERT INTO MST_ANSWER VALUES ('A37', 'a', NULL, NULL, '2024/06/13 14:29:00', '1', NULL, NULL);
INSERT INTO MST_ANSWER VALUES ('A43', 'b', 'ORDER BY が並び替えるソートであるため昇順はASC、降順は DESC', NULL, '2024/06/12 14:50:00', '1', NULL, NULL);
INSERT INTO MST_ANSWER VALUES ('A38', 'a', NULL, NULL, '2024/06/13 14:32:00', '1', NULL, NULL);
INSERT INTO MST_ANSWER VALUES ('A39', 'b', NULL, NULL, '2024/06/13 14:38:00', '1', '2024/06/13 14:44:00', '1');
INSERT INTO MST_ANSWER VALUES ('A40', 'c', NULL, NULL, '2024/06/13 14:59:00', '1', NULL, NULL);
INSERT INTO MST_ANSWER VALUES ('A41', 'a', NULL, NULL, '2024/06/13 15:06:00', '1', NULL, NULL);
INSERT INTO MST_ANSWER VALUES ('A42', 'c', NULL, NULL, '2024/06/13 15:10:00', '1', NULL, NULL);
INSERT INTO MST_ANSWER VALUES ('A44', 'a', 'REPLACE関数は文字列の一部を文字列に置換する関数です。', NULL, '2024/06/12 15:19:00', '1', NULL, NULL);
INSERT INTO MST_ANSWER VALUES ('A45', 'd', NULL, NULL, '2024/06/13 11:39:00', '1', NULL, NULL);
INSERT INTO MST_ANSWER VALUES ('A46', 'd', NULL, NULL, '2024/06/13 11:42:00', '1', NULL, NULL);
INSERT INTO MST_ANSWER VALUES ('A47', 'd', NULL, NULL, '2024/06/13 11:45:00', '1', NULL, NULL);
INSERT INTO MST_ANSWER VALUES ('A48', 'a', NULL, NULL, '2024/06/13 11:47:00', '1', NULL, NULL);
INSERT INTO MST_ANSWER VALUES ('A49', 'c', NULL, NULL, '2024/06/13 11:49:00', '1', NULL, NULL);
INSERT INTO MST_ANSWER VALUES ('A50', 'b', NULL, NULL, '2024/06/13 11:52:00', '1', NULL, NULL);
INSERT INTO MST_ANSWER VALUES ('A11', 'b', '数値比較処理を関数で作成する問題で引数の値を比較し、関数の戻り値として、真偽を設定できるように関数宣言しています。', NULL, '2024/06/12 16:11:37', '1', NULL, NULL);
INSERT INTO MST_ANSWER VALUES ('A12', 'a', NULL, NULL, '2024/06/12 16:17:36', '1', NULL, NULL);
INSERT INTO MST_ANSWER VALUES ('A13', 'c', NULL, NULL, '2024/06/12 16:19:47', '1', NULL, NULL);
INSERT INTO MST_ANSWER VALUES ('A20', 'd', 'ラベル記述だと、上のa?bですね', NULL, '2024/06/13 10:53:20', '1', NULL, NULL);
INSERT INTO MST_ANSWER VALUES ('A21', 'd', 'なんと、a?bがダメなんですね…', NULL, '2024/06/13 10:57:15', '1', NULL, NULL);
INSERT INTO MST_ANSWER VALUES ('A25', 'a', NULL, NULL, '2024/06/13 13:31:55', '1', NULL, NULL);
INSERT INTO MST_ANSWER VALUES ('A9', 'd', NULL, NULL, '2024/06/12 15:27:30', '1', NULL, NULL);
INSERT INTO MST_ANSWER VALUES ('A14', 'c', NULL, NULL, '2024/06/12 16:25:19', '1', NULL, NULL);
INSERT INTO MST_ANSWER VALUES ('A15', 'd', NULL, NULL, '2024/06/12 16:27:17', '1', NULL, NULL);
INSERT INTO MST_ANSWER VALUES ('A3', 'a', 'System.out.println(i++);この時点では50　System.out.println(++i);ここの時点で52　System.out.println(++i + 10);ここで63になる', NULL, '2024/06/12 14:09:31', '1', NULL, NULL);
INSERT INTO MST_ANSWER VALUES ('A1', 'd', 'byteはとても小さな整数short小さな整数intは普通の整数long大きな整数となっているため', NULL, '2024/06/12 13:41:34', '1', NULL, NULL);
INSERT INTO MST_ANSWER VALUES ('A2', 'a', NULL, NULL, '2024/06/12 13:55:27', '1', NULL, NULL);
INSERT INTO MST_ANSWER VALUES ('A5', 'a', NULL, NULL, '2024/06/12 14:44:14', '1', NULL, NULL);
INSERT INTO MST_ANSWER VALUES ('A4', 'c', NULL, NULL, '2024/06/12 14:13:16', '1', NULL, NULL);
INSERT INTO MST_ANSWER VALUES ('A6', 'c', NULL, NULL, '2024/06/12 14:59:18', '1', NULL, NULL);
INSERT INTO MST_ANSWER VALUES ('A7', 'a', NULL, NULL, '2024/06/12 15:04:02', '1', NULL, NULL);
INSERT INTO MST_ANSWER VALUES ('A8', 'b', NULL, NULL, '2024/06/12 15:07:48', '1', NULL, NULL);
INSERT INTO MST_ANSWER VALUES ('A18', 'b', NULL, NULL, '2024/06/13 9:24:21', '1', NULL, NULL);
INSERT INTO MST_ANSWER VALUES ('A23', 'c', NULL, NULL, '2024/06/13 11:22:40', '1', NULL, NULL);
--
--問題マスタ
--
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q15', 'C000000007', 'A16', 'pathインターフェースのlistFile()', 'FileクラスのlistFile()', 'Fileクラスのlist()', 'Fileクラスのfind()', 'java.io.FileクラスのlistFiles()メソッドと近い機能を提供するメソッドとして正しいものはどれですか', 'メソッド?高難易度問題?', '0', '2024/06/12 16:28:48', '1', NULL, NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q18', 'C000000001', 'A22', 'var a;', 'var b=null;', 'var d={1,2,3};', 'var e=new ArrayList<>();', '次の変数宣言のうち、コンパイルエラーにならないものはどれか', ' 変数宣言の問題！', '0', '2024/06/13 10:32:01', '1', NULL, NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q16', 'C000000008', 'A17', '*', '/', '%', '+', '実行イメージ通りになるように、if文の中の条件(ア)を完成させない
[実行イメージ]
246

public class Test001_Q10 {
	public static void main (String [] args) {
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
}', '繰り返し！', '0', '2024/06/12 16:38:01', '1', NULL, NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q20', 'C000000008', 'A24', 'b<5', '5>b', 'a<5', 'a>5', '0?4までの数字を順に表示したい。(ア)に入る適切なコードはどれですか？


public class free2 {

	public static void main(String[] args) {
	int a =11;
	int b =0;
	while((ア)) {
	if(5<a) {
	System.out.println(b);
	}
	a--;
	b++;
     }
  }
}', 'while文問題！', '0', '2024/06/13 10:38:23', '1', '2024/06/13 10:48:39', 'null');
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q30', 'C000000011', 'A30', 'ファイル', 'テーブル', 'リレーショナルデータベース', 'フィールド', '次の文章の空白部を答えてください。データベースの中でも複数の表の形式でデータを管理するものを（ あ）といいます。', 'SQLの基本的な問題', '0', '2024/06/12 14:38:00', '1', NULL, NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q31', 'C000000014', 'A31', 'ORDERR BY 句では、最後の副問合せに含まれる列名や列別名で指定する。', 'ORDER BY 句でソート列を指定は、必ず列の位置で指定する必要がある。', '.ORDER BY句でソート列を列名や列別名で指定する場合は、最初の問合せの列名や列別名のみ認識される。', '複合問合せの各問合せには独自のORDER BY句を書いてもエラーぬはならないが、最後のORDER BY句のみが有効となる。', '副問合せにおける、ORDER BY句の使用について正しい記述はどれですか。', '副問合せにおける、ORDER BY句について学ぼう', '0', '2024/06/13 11:56:00', '1', NULL, NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q32', 'C000000022', 'A32', 'インサート対象として、ビューを指定することはできない。', 'インサート対象として、索引構成表を指定することはできない。', '副問合せ対象として、ビューを指定することができない。', '副問合せ対象として、索引構成表を指定することはできない。', '複数表のINSEERT文（マルチテーブル・インサート）関して、正しい記述はどれか。', 'INSEERT文についての応用', '0', '2024/06/13 12:00:00', '1', NULL, NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q33', 'C000000022', 'A33', '主キー列にNULL値に入力することはできない。', '一意キー列にNULL値は入力することはできない。', '一意キー列にNULL値は1行のみなら挿入できる。', '外部キー列にNULL値を入力することはできない。', 'リレーショナル・データベースのキーについて正しい記述はどれですか。', 'リレーショナル・データベースについて', '0', '2024/06/13 13:18:00', '1', NULL, NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q34', 'C000000022', 'A34', '列にデフォルト値は設定する。', 'すべての行を切り捨てる。', 'VARCHAR2型からNUMBER型に変更する。', '１つの行を切り捨てる。', 'すでに1000行の行データを持つ既存の表に対してALTER TABLEコマンドで実行可能な操作はどれですか。', 'ALTER TABLEの学習', '0', '2024/06/13 13:21:00', '1', NULL, NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q35', 'C000000011', 'A35', 'UNDOが残っている間であれば、列の削除をロールバックすることができる。', 'UNDOが残っている間であれば、未使用に設定した列を取り戻すことができる。', 'pa-jiされいなければ、削除した列をごみ箱(RECYCLEBUN)からリカバリできる。', '未使用に設定した列を使用可能に戻すことはできない。', '列の削除に関して正しい記述はどれですか。', 'トランザクション処理について', '0', '2024/06/13 13:24:00', '1', NULL, NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q36', 'C000000022', 'A36', 'REFERENCESはシーケンスに対して付与できる。', 'UPDATEの権限を付与する床、表またはビューの列を指定できる。', 'SELECTの権限を付与する時、表またはビューの列を指定できる。', 'EXECUTEは、プロシージャに対して付与できない。', '"オブジェクト権限の付与に関して正しい記述はどれですか。', 'オブジェクト権限', '0', '2024/06/18 13:15:00', '1', NULL, NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q37', 'C000000015', 'A37', '"品目コード IN (SELECT 品目コード FROM 品目マスタ WHERE 単位 = ''個'')', '"', '品目コード = (SELECT 品目コード FROM 品目マスタ WHERE 単位 = ''個'')', '品目コード SELECT 品目コード　FROM 品目マスタ WHERE 単位 = ''個''', '品目コード IN(SELECT 品目コード,単位 FROM 品目マスタ WHERE　単位 = ''個'')', '"品目マスタの「単位」が ""個""の品目の2022年4月発注日分仕入データを取得する', '0', '2024/06/18 13:15:01', '1', NULL, NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q38', 'C000000015', 'A38', 'INSERT INTO　品目マスタ (品目コード , 品名 , 単位 , 単価)　VALUES ( ''A000022'' , ''ネジ'' , ''個'' , 200 );', 'INSERT 品目マスタ　INTO　(品目コード , 品名 , 単位 , 単価)　VALUES ( ''A000022'' , ''ネジ'' , ''個'' , 200 );', 'INSERT INTO　品目マスタ　(品目コード = ''A000022'' , 品名 = ''ネジ'' , 単位 = ''個'' , 単価 =  200)', 'INSERT INTO　品目マスタ (品目コード , 品名 , 単位 , 単価) = ( ''A000022'' , ''ネジ'' , ''個'' , 200 );', '"テーブルに新たに１レコード追加するSQL文を記載されているのはどれか。登録するデータは以下の通りとする。', 'INSERT文について', '0', '2024/06/18 13:15:02', '1', NULL, NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q39', 'C000000015', 'A39', '品名 = CONCAT(単価 + ''円''　AS　VARCHAR2(6))', '品名 = CAST(単価 AS VARCHAR2(6)) || ''円''', '品名 = CASE(単価 AS VARCHAR2(6)) || ''円''', '品名 = REPLACE (単価 AS VARCHAR2(6)) || ''円''', '"仕入テーブルのレコードのうち、単価が4桁未満のレコードの品名を更新するSQL文を記載してください。変更後の品名はそのレコードの単価 + ''円''とすること。ただし、品名のレコードの単価は、明示的な型変換を行うこと。', '明示的な型変換', '0', '2024/06/18 13:15:03', '1', NULL, NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q40', 'C000000017', 'A40', 'SELECT * FROM 経費マスタ WHERE (項目 = ''消耗品費'' AND 経費 <= 3000) AND (項目 = ''旅費交通費'' AND 経費 >= 6000);', 'SELECT * FROM 経費マスタ WHERE (項目 = ''消耗品費'' AND 経費 => 3000) OR (項目 = ''旅費交通費'' AND 経費 <= 6000);', 'SELECT * FROM 経費マスタ WHERE (項目 = ''消耗品費'' AND 経費 <= 3000) OR (項目 = ''旅費交通費'' AND 経費 >= 6000);', 'SELECT * FROM 経費マスタ WHERE (項目 = ''消耗品費'' AND 経費 <= 3000) AND (項目 = ''旅費交通費'' AND 経費 >= 6000);', '登録されているデータの中から、項目が消耗品費で、経費が3000以下のレコード、または、項目が旅費交通費で、経費が6000以上のレコードを取得するSQL文を記載されているものはどれか。', '条件式について学ぼう', '0', '2024/06/13 14:59:00', '1', NULL, NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q43', 'C000000022', 'A42', '1つ目の問合せでは戻されるが、2つ目の問合せでは戻されない一意の行のみが返される。', '複合問合せに含まれる各問合せの順番を入れ替えたら、出力結果は変わる。', '内部的にソートが行われる。', '選択列に含まれるNULLは無視される。', 'INTERSECT 演算子による複合問合せについて正しい記述はどれですか。', 'INTERSECT', '0', '2024/06/13 15:10:00', '1', NULL, NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q42', 'C000000013', 'A41', ' AYZ?AY?A', 'AYZAYA', 'AYZ?XY?X', 'AYZ?AY?A?', '"次の問題を確認してください。', '難問！', '0', '2024/06/18 13:15:10', '1', NULL, NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q45', 'C000000012', 'A45', 'MINUS', 'UNION', 'REPLACE', 'INTERSECT', '積集合を求める演算子を答えよ。', '演算子を覚えてね。', '0', '2024/06/13 11:39:00', '1', NULL, NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q46', 'C000000011', 'A46', '()と{}と[]を使用して、式内の算術演算子のデフォルトの優先順位を変更できる', 'NULLは式内の算術演算子の優先順位に影響を与える', ' +と-のみを含む式では、カッコがない場合、+が優先される', ' 優先度が等しい算術演算子は、カッコがない場合、左から右に評価される', '算術演算子の優先順位にのルールについて正しいものはどれか。', '演算子を学ぼう', '0', '2024/06/13 11:42:00', '1', NULL, NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q10', 'C000000007', 'A11', 'ア、ture 　イ、true', 'ア、ture 　イ、false', 'ア、false 　イ、false', ' ア、false 　イ、true', '// Scannerクラスのインスタンスを作成
		Scanner scanner = new Scanner(System.in);
	
		// 入力
		System.out.println("１回目の数値入力");
		int input_num1 = scanner.nextInt();
	
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
		}', '関数の問題！', '0', '2024/06/12 16:11:37', '1', NULL, NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q11', 'C000000021', 'A12', 'Closeable', 'Exeption', 'Serializable', 'RuntimeExeption', '(ア)に入る正しいクラス名はどれですか

(ア)を実装したクラスは、try-with-resources文を実装できる
', '応用問題', '0', '2024/06/12 16:17:36', '1', NULL, NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q12', 'C000000021', 'A13', 'SQLExeption', 'IOExeption', 'llegalStateExeption', 'Exeption', '実行時例外クラスは次のうちどれですか', '応用例外！', '0', '2024/06/12 16:19:47', '1', NULL, NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q21', 'C000000021', 'A20', '代入', 'return文', 'tryブロック', 'a?bのすべて', '次の中からラベル記述ができるものを選びなさい', 'ラベル記述ってなぁ?に？', '0', '2024/06/13 10:53:20', '1', NULL, NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q22', 'C000000001', 'A21', 'int b[2];', ' int[2] c[]', 'int d[3][];', '選択肢 a?cまですべて誤り', '配列型変数の宣言として、正しいものを選びなさい', 'Q!配列型変数宣言', '0', '2024/06/13 10:57:15', '1', NULL, NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q24', 'C000000001', 'A25', 'アクセス修飾子がデフォルトのままのフィールドは、すべてのサブクラスのメソッドからアクセスできる', 'アクセス修飾子がprivateなメッソドであっても、サブクラスからは利用できる', 'サブクラスであっても、コンストラクタは引き継がない', 'アクセス修飾子がprotectedなメッソドには、同じパッケージに属するサブクラスのみアクセスできる', ' 継承問題！', '継承とは？？？？？', '0', '2024/06/13 13:31:55', '1', NULL, NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q47', 'C000000017', 'A47', 'WHERE sysdate - hire_date <= 60', 'WHERE ADD_MONTHS(hire_date,60) <= sysdate', ' WHERE MONTHS_BETWEEN(hire_date, sysdate) <=60', 'WHERE MONTHS_BETWEEN(sysdate, sysdate) <=60', 'あなたは、入社日（hire_date)が過去60カ月以内の行を表示しようと考えています。どのWHERE句を使用しますか。', 'WHERE句の復習', '0', '2024/06/13 11:45:00', '1', NULL, NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q48', 'C000000015', 'A48', 'SELECT MIN(AVG(salary)) FROM employees GROUP BY job_id;', 'SELECT ANG(MIN(salary)) FROM employees；', 'SELECT job_id,MIN(AVG(salry))FROM employees GROPU BY job_id;', ' SELECT job_id,AVG(MIN(salry))FROM employees GROPU BY job_id;', '実行してエラーにならない問合わせはどれか。', '文法を覚えよう', '0', '2024/06/13 11:47:00', '1', NULL, NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q49', 'C000000022', 'A49', '存続の一意検引を非一意索引に変更できる。', 'DROP TABLE文で表がRECYCLE BINに移ると、その表に定義されていた索引はすべてUNUSABLEになる。', '表と策引は常に同じスキーマに属するとは限らない。', '索引列の列値を更新した後、それを索引エントリに反省するには手動で再構築する必要がある。', '検引について正しい記述はどれですか？', '検引について学ぼう', '0', '2024/06/13 11:49:00', '1', NULL, NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q50', 'C000000012', 'A50', 'UNION ALL をUNIONに置き換えると、出力される行数が増える可能性がある。', 'UNION ALL では出力はソートされる。', 'UNION ALL では重複行は排除される。', 'UNIONでは、複合問い合わせに含まれる各問合せに共通するデータを戻す。', 'UNION 演算子とUNION ALL演算子について正しい記述はどれですか。', 'UNIONを覚えよう', '0', '2024/06/13 11:52:00', '1', NULL, NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q44', 'C000000013', 'A44', 'REPLACE(品目コード, SUBSTR(品目コード, 1, 1),''B'')', 'SUBSTR(品目コード, REPLACE(品目コード, 1, 1), ''B'')', 'REPLACE(品目コード, SUBSTR(品目コード, 1, 0, ''B'' )', 'SUBSTR(品目コード, REPLACE(品目コード, 1, 0), ''B'')', '発注計画テーブルの品目コードの先頭1文字をBに置き換えて取得するSQL文を表示する項目は品目コードのみとし、品目コード(昇順)でソートすること。アに入る解答はどれか	SELECT ア FROM 発注計画テーブル ORDER BY	品目コード;', '関数問題', '0', '2024/06/18 13:13:03', '1', NULL, NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q41', 'C000000012', 'A43', 'GROUP BY', 'ORDER BY', 'ORDER', 'OFFSET  0 ROWS', '発注計画テーブルに登録されている全データから、単価が350未満のレコードを取得するSQL文を記載してください。表示する項目は品名、数量、単価、発注日、納期とし、発注日(昇順)でソートすること。	ア　に入る解答はどれか	SELECT 品名,数量,単価,発注日,納期	FROM 発注計画テーブル WHERE	単価 < 350 ア	発注日;', '並び替え問題！', '0', '2024/06/18 14:42:09', '1', NULL, NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q9', 'C000000002', 'A9', '[2]と[3]', '[3]と[3]', '[4]と[3]', '[3]と[2]', 'Test005_Q03_sample sample_A = new Test005_Q03_sample()	 Test005_Q03_sample sample_B = sample_A;		 sample_A.y = sample_A.x++;				 sample_A.printMessage();   public class Test005_Q03_sample { 	int x = 2;					 	int y = 0;					 	// xとyの設定値を出力			 	public void printMessage () {			 		System.out.println("ｘ" + x  +"　"+"y：" + y); 		x++;				 	} }  printMessageを使用したときに出力する変数[x]と[y]の値を選べ', 'インクリメント演算子', '0', '2024/06/12 15:27:30', '1', NULL, NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q13', 'C000000021', 'A14', '()->', 'x,y->x*y', '(Fool)->{return;}', '(Foo f1,f2)->0', 'ラムダ式の記述方法として正しいものはでれですか', '解いてみよう！ラムダ式', '0', '2024/06/12 16:25:19', '1', NULL, NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q14', 'C000000021', 'A15', 'jav.basicモジュール', 'java.seモジュール', 'java.langモジュール', 'java.baseモジュール', 'Java SEが提供するモジュールのうち、すべてのモジュール宣言で暗黙的にrequiresとなるモジュールは次のどれですか1つ選択してください', '解いてみよう！モジュール編', '0', '2024/06/12 16:27:17', '1', NULL, NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q1', 'C000000001', 'A1', 'byte <long  < int  < short', 'short < byte < int < long', 'short < int < byte < long', 'byte < short < int < long', '整数のデータ型が大きい順に並んでいるものはどれか', '整数のデータ型の問題', '0', '2024/06/12 13:52:39', '1', NULL, NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q3', 'C000000002', 'A3', '63', '62', '64', '65', '問3	下記の順でプログラムを実行した場合、インクリメントについて出力されるウの値を選択して答えよ※出力するiに対して加算させていくことint  i = 50;ア	System.out.println(i++);イ	System.out.println(++i);ウ	System.out.println(++i + 10);エ	System.out.println(i++ + 10);', 'インクリメント演算子の問題', '0', '2024/06/12 14:09:52', '1', NULL, NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q2', 'C000000003', 'A2', 'length', 'main', 'String', 'else', '配列の要素数を取得する際に用いられるもので配列の元々宣言されているフィールドの変数名を答えよ', '配列の問題', '0', '2024/06/12 13:58:18', '1', NULL, NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q4', 'C000000001', 'A4', '+5', 'num1', 'num1 + 5', '++5	', '変数num1 にプラス5した値を変数num2に代入するのに適切なものを選んでください。public class Test001_Q04 {public static void main (String [] args) { int num1;int num2;num1 = 1;num2 =  アSystem.out.println(num1);System.out.println(num2);}}', '変数の問題', '0', '2024/06/12 14:19:41', '1', NULL, NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q5', 'C000000004', 'A5', 'Integer.parseInt ', 'next.LIne()', 'java.util.Scanner', 'next.Int()', '文字列から数値型への型変換を行う適切なプログラムを選べ', '型変換の問題', '0', '2024/06/12 14:48:34', '1', NULL, NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q6', 'C000000005', 'A6', 'static', 'void', 'final', 'abstract', 'Javaにおいて、宣言に（ア）がついているクラスは継承できませんなにがついていると継承できないでしょうか', '継承における宣言', '0', '2024/06/12 15:02:01', '1', NULL, NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q7', 'C000000003', 'A7', ' ArrayIndexOutOfBoundsException', 'Unresolved compilation problem', 'ArrayIndexOfBoundsException', 'Unresolved problem', '配列で格納データ取得した際に想定されている要素数の範囲外を指定した場合に発生する実行時例外を答えよ', '実行時例外', '0', '2024/06/12 15:06:19', '1', NULL, NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q8', 'C000000006', 'A8', 'abstract', 'implements', 'extends', 'finally', 'インターフェースを親とする子クラスの定義に用いるものはどれか', 'インターフェース！', '0', '2024/06/12 15:10:11', '1', NULL, NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q17', 'C000000002', 'A18', '==', '!=', '>', '<', '左辺と右辺が異なる、関係演算子を答えよ', '関係演算子！', '0', '2024/06/13 9:24:21', '1', NULL, NULL);
INSERT INTO JSSSYSTEM.MST_QUESTION VALUES ('Q23', 'C000000005', 'A23', 'アクセス修飾子がデフォルトのままのフィールドは、すべてのサブクラスのメソッドからアクセスできる', 'アクセス修飾子がprivateなメッソドであっても、サブクラスからは利用できる', 'サブクラスであっても、コンストラクタは引き継がない', 'アクセス修飾子がprotectedなメッソドには、同じパッケージに属するサブクラスのみアクセスできる', '継承の説明として正しいものを選びなさい', '継承とは？？？？？', '0', '2024/06/13 11:22:40', '1', NULL, NULL);