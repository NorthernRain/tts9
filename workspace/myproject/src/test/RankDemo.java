package test;

public class RankDemo {

    public static void main(String[] args) {
        /*
         * 甲乙丙丁四人讨论比赛结果：甲说乙第3名，丙第2名；乙说甲第4名，丁第1名；丙说丙第4名，丁第3名；丁说乙第1名，甲第2名。
		 * 老师说你们每个人都只对了一半！问四位同学的名次！
		 */

		/*
		 * 定义一个4x4的二维数组，二维数组的行表示甲说的答案，列表示甲说的答案的位次是谁，例如甲说乙为第三，那么第一行（甲）代表甲说的，第2列（乙
		 * ），代表是乙的名次是第一行第二列这个数
		 */
        int[][] rank = new int[4][4];
        rank[0][1] = 3;
        rank[0][2] = 2;
        rank[1][0] = 4;
        rank[1][3] = 1;
        rank[2][2] = 4;
        rank[2][3] = 3;
        rank[3][0] = 2;
        rank[3][1] = 1;
        // 记录一次寻找结果循环了几次。
        int time = 0;
        // 记录甲乙丙丁对应的名次，例如数组值为{2.3.4.1}就是说甲是第2，乙是第3
        int[] index = new int[4];
        // 输出结果时与index对应，输出甲乙丙丁的名次；
        String[] name = {"甲", "乙", "丙", "丁"};
        // 开关，其原理就是当遍历了一行找到结果之后，就关闭这一行的遍历！后面详细介绍
        boolean[] flag = new boolean[4];
        // 开始的时候先寻找第一名！
        int h = 1;
		/*
		 * 程序开始，先对二维数组遍历，一行一行地遍历，K控制整体循环次数，i控制的是二维数组的行，j为列：
		 * 就是每次遍历都会遍历4行4列。一共遍历4次，因为是4个名次。
		 */
        for (int i = 0, k = 1; k <= 4; i++) {
            int tem = 0;
            // ！flag[i]代表这一行还未寻找到我需要的h值，h值不在这一行。
            for (int j = 0; !flag[i] && j < 4; j++) {

                // System.out.println("tem:" + tem);
				/*
				 * 如果遍历到rank[i][j]=h，令index[j]=h;(h代表名次，index[j]代表在哪一列，也就是代表是谁)
				 */
                if (rank[i][j] == h) {
                    index[j] = h;
                    // System.out.println("i:" + i);
                    // System.out.println("j:" + j);

                    // System.out.println("h:" + h);
					/*
					 * 此行找到了h名，也就是代表假设这个人说的j（甲乙丙丁name[j]）是h名成立，那么这一行判断完成，
					 * 此后不再遍历。
					 */
                    flag[i] = true;
                    // k++,说明判断完一次。
                    k++;
					/*
					 * tem为当前这一行的值（2个）的和，为的是减去当前h，得到当前这个人（这一行）说的另一个名次（假）
					 * 然后判断另一个名次。因为他说的这个名次为假，那么这个位次在其他人那里说出来就是真
					 */
                    tem = (rank[i][0] + rank[i][1] + rank[i][2] + rank[i][3]);
                    h = tem - h;
					/*
					 * i--是因为，当这次判断完后，如果没到数组第4行没必要继续下去，直接开始下一次判断。
					 * 因为每次判退出当前循环i会自增1，为了i从0开始，i=-1
					 */
                    i = -1;

                    break;
                }
                time++;
            }
			/*
			 * 当遍历到第四行（i=3），为了不让数组i越界，上面说了i会自增1（for循环），因为for里面没有i的判断，所以当遍历完第4行，
			 * i从0开始。
			 */
            if (i == 3)
                i = -1;
        }
        System.out.println(time);
        for (int i = 0; i < 4; i++) {
            System.out.println(name[i] + "是第：\0" + index[i] + "名。");

        }
        System.out.println("或者：");
        // 另一种情况，从第四名开始找。
        h = 4;
        time = 0;
        flag = new boolean[4];
        for (int i = 0, k = 1; k <= 4; i++) {
            int tem = 0;
            for (int j = 0; !flag[i] && j < 4; j++) {

                // System.out.println("tem:" + tem);
                if (rank[i][j] == h) {
                    index[j] = h;
                    flag[i] = true;
                    k++;
                    tem = (rank[i][0] + rank[i][1] + rank[i][2] + rank[i][3]);
                    h = tem - h;

                    i = -1;
                    break;
                }
                time++;
            }

            if (i == 3)
                i = -1;
        }
        System.out.println(time);
        for (int i = 0; i < 4; i++) {
            System.out.println(name[i] + "是第：\0" + index[i] + "名。");

        }
    }

}
