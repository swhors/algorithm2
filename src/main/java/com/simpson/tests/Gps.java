package com.simpson.tests;

public class Gps {
	public int solution(int n, int m, int[][] edge_list, int k, int[] gps_log) {
		int answer = 0;
		return answer;
	}
	
	public static void main(String []args) {
		int []ns = {7,7};
		int [][][] edge_lists = {
			{{1,2},{1,3},{2,3},{2,4},{3,4},{3,5},{4,6},{5,6},{5,7},{6,7}},
			{{1,2},{1,3},{2,3},{2,4},{3,4},{3,5},{4,6},{5,6},{5,7},{6,7}}};
		int []ks = {6,6};
		int []ms = {10,10};
		int [][]gps_logs = {{1,2,3,3,6,7},{1,2,3,6,5,7}};
		int []answers = {1,0};
		Gps gps = new Gps();
		for (int i = 0; i<2; i++) {
			int result = gps.solution(ns[i],ms[i],edge_lists[i],ks[i],gps_logs[i]);
		}
	}
}
