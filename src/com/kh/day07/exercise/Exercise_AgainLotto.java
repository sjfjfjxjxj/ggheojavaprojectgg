package com.kh.day07.exercise;

import java.util.Random;

public class Exercise_AgainLotto {
	public static void main(String [] args) {
		// �ζǹ�ȣ �ڵ������� ���α׷� �ߺ����� �����ϱ� //�ߺ��� �����Ϸ��� ��� ���ؾ���
		// �� ����� ������������ ����
		// ��ȣ 6��(->ũ��6�� �迭), ��ȣ ���� 1~45
		// ��ȣ�� 1���� �����ϴ� �ζǹ�ȣ
		int [] lottos = new int[6];
		Random rand = new Random();
		for(int i = 0; i<lottos.length; i++) { //������ �ڸ��� ��ȣ �̾Ƽ� �־�
			lottos[i] = rand.nextInt(45) + 1;
			for(int e = 0; e < i; e++) { //���������� �ߺ����� Ȯ���� �ؾ���. ù��°�ִ� ���ʿ����. �ι�°�ִ� 1����... ������°�ִ� 5�� ��
				if(lottos[i]==lottos[e]) {
					i--; //ex. 6��° �̾����� 5��°�ֶ�, 4��°�ֶ� �̷��� ��
					break; //������ �̾����� ����������
				}//�̷��� ��ȣ�̱�� ����. ���� �̰�
			}
		}//�������ķ� �������� �����Ұž�. �翷�̶� ���ؼ� �����ٲٴ°�
		for(int i = 0; i < lottos.length - 1; i++) {
			for(int e = 0; e < (lottos.length - 1)-i; e++) {
				if(lottos[e] > lottos [e + 1]) {
					int temp = lottos[e+1];
					lottos[e+1] = lottos[e];
					lottos[e] = temp;
				}
			}
		}
		
		//���
		for (int i = 0; i <lottos.length; i++) {
			System.out.print(lottos[i]+" ");
	}
	}
}
