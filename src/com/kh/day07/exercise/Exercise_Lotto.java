package com.kh.day07.exercise;

//�������(�迭+����+��������+����)
import java.util.Random;

public class Exercise_Lotto {
	public void lottoProgram() {
		// �ζǹ�ȣ �ڵ������� ���α׷� �ߺ����� �����ϱ� //�ߺ��� �����Ϸ��� ��� ���ؾ���
		// �� ����� ������������ ����
		// ��ȣ 6��(->ũ��6�� �迭), ��ȣ ���� 1~45
		// ��ȣ�� 1���� �����ϴ� �ζǹ�ȣ
		int[] lottos = new int[6];
		Random rand = new Random();
		for (int i = 0; i < lottos.length; i++) { // i=�ݺ��Ǵ�Ƚ��=�迭ũ��
			lottos[i] = rand.nextInt(45) + 1; // �ζ�=�������ڸ� �迭�� �ϳ��� �ִ´�=��ȣ�̴´�
			for (int e = 0; e < i; e++) {
				// �񱳸� �Ѵ� -> �񱳴� ���� ������(i�� Ŀ��������). ������ ���ڶ� ��� ���ؾ��ϴϱ�
				if (lottos[i] == lottos[e]) { // �񱳴� ���ݻ����Ŷ� ù��°�ź����Ѵ�
					i--; // �̰͸� ������ ù��° ���� ��� �̴´�.
					break; // ���� �� �̾����� �ڵ��ư��� ����������
				}
			}
		}
		// ���� �̰� �������� ���� �Ѵ�(���������̿�)
		for (int i = 0; i < lottos.length - 1; i++) {
			for (int e = 0; e < (lottos.length - 1) - i; e++) {
				if (lottos[e] > lottos[e + 1]) {
					int temp = lottos[e + 1];
					lottos[e + 1] = lottos[e];
					lottos[e] = temp;
				}
			}
		}
		// �����Ѱ� ���
		for (int i = 0; i < lottos.length; i++) {
			System.out.print(lottos[i] + " ");
		}
	}
}
