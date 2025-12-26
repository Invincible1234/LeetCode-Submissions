class Solution(object):
    def checkIfExist(self, arr):
        

        for i in range(len(arr)):
            if arr[i] == 0:
                if arr.count(0) > 1:
                    return True
            else:
                if 2 * arr[i] in arr:
                    return True

        return False
           
        