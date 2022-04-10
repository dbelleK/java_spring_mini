package kr.co.softsoldesk.beans;

public class PageBean {
	
	// �ּ� ������ ��ȣ
	private int min;
	// �ִ� ������ ��ȣ
	private int max;
	// ���� ��ư�� ������ ��ȣ
	private int prevPage;
	// ���� ��ư�� ������ ��ȣ
	private int nextPage;
	// ��ü ������ ����
	private int pageCnt;
	// ���� ������ ��ȣ
	private int currentPage;
	
	
	// contentCnt : ��ü�� ����, currentPage : ���� �� ��ȣ, contentPageCnt : �������� ���� ����, paginationCnt : ������ ��ư�� ����
	public PageBean(int contentCnt, int currentPage, int contentPageCnt, int paginationCnt) {
		
		// ���� ������ ��ȣ
		this.currentPage = currentPage;
		
		// ��ü ������ ����
		pageCnt = contentCnt / contentPageCnt;
		//533/10=53 �̹Ƿ� 1page�� �ʿ�
		if(contentCnt % contentPageCnt > 0) {
			pageCnt++;
		}
		/* 
		 1 ~ 10 : 1(�ּ�), 10(�ִ�)
		 11 ~ 20 : 11, 20
		 21 ~ 30 : 21, 30
		
		 //-1
		 0 ~ 9 : 1
		 10 ~ 19 : 11
		 20 ~ 29 : 21
		
		//�������� ���ǰ����� ������
		0:1
		1:11
		2:21
		//�������� ���ǰ����� �ٽ� ���ϸ�
		0:1
		10:11
		20:21
		//+1�� �ϸ�
		1:1
		11:11
		21:21*/
		
		min = ((currentPage - 1) / contentPageCnt) * contentPageCnt + 1;
		max = min + paginationCnt - 1; //1+10=11�̹Ƿ� 1�� ����
		//51���������� 60���� ~ 69��°�۱��� �����ϹǷ� 
		//��ü�������� �Ѿ�� �ʵ��� ������
		if(max > pageCnt) {
			max = pageCnt;
		}
		
		prevPage = min - 1;
		nextPage = max + 1;
		//�������������� �Ѿ�� �ʵ���
		if(nextPage > pageCnt) {
			nextPage = pageCnt;
		}
	}
	
	public int getMin() {
		return min;
	}
	public int getMax() {
		return max;
	}
	public int getPrevPage() {
		return prevPage;
	}
	public int getNextPage() {
		return nextPage;
	}
	public int getPageCnt() {
		return pageCnt;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	
	
}
