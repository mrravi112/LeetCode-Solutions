#include <bits/stdc++.h>
using namespace std;
class Solution {
public:
    int countTrapezoids(vector<vector<int>>& points) {
        const long long MOD = 1000000007;
        unordered_map<int,int> freq;
        for(auto &p: points) freq[p[1]]++;
        vector<long long> ways;
        for(auto &it: freq){
            long long k = it.second;
            if(k >= 2) ways.push_back((k*(k-1)/2) % MOD);
        }
        long long ans = 0, pref = 0;
        for(long long w: ways){
            ans = (ans + w * pref) % MOD;
            pref = (pref + w) % MOD;
        }
        return (int)ans;
    }
};
