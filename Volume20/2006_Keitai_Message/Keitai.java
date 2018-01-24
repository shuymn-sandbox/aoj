import java.io.*;

class Keitai {

	//システムの改行コード取得
	public static final String NEWLINE = System.lineSeparator();

	public static void main(String[] args) {
		try {

			decodeMessage(userInput());
			System.out.println(NEWLINE);
			
		} catch (Exception e) {
			System.err.println(e + NEWLINE + ";(");
		}
	}

	private static int firstInput() throws Exception {

	}

	//ユーザの入力を受け付けるメソッド
	private static String userInput() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseint(br.readLine());
		String[] strArray = new String[num];

		for (int i = 0; i < num; i++) {
			strArray[i] = br.readLine();
		}

		return str;
	}
	//メッセージを数字から文字列に変換するメソッド
	private static void decodeMessage(String[] strArray) throws Exception {

		String[] strButton = {
			{null},			// button 0
			{".,!? "},		// button 1
			{"abc"},		// button 2
			{"def"},		// button 3
			{"ghi"},		// button 4
			{"jkl"},		// button 5
			{"mno"},		// button 6
			{"pqrs"},		// button 7
			{"tuv"},		// button 8
			{"wxyz"}		// button 9
		};

		//文字列を0で分割してmsgArrayに格納
		String[][] msgArray = new String[strArray.length][];

		for (int i = 0; i < strArray.length; i++) {
			msgArray[i][] = strArray[i].split("0", 0);
		}

		for (String tmp: msgArray){
			if (!tmp.equals("")){

				//押したボタンの番号を一文字切り出してnumButtonに格納
				int numButton = Integer.parseInt(tmp.substring(0,1));
				
				//ボタンを連続して押した回数をnumRepeatに格納
				int numRepeat = tmp.length() % strButton[numButton-1].length;
				if (numRepeat == 0) numRepeat = tmp.length();

				System.out.print(strButton[numButton-1][numRepeat-1]);
			}
		}
	}
}
