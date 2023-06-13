#include <iostream>
#include <vector>
#include <string>

// using namespace std;
using namespace std;
// using namespace vector

bool IsPopOrder(const int* push, const int* pop, int nlenght);

int main() {


  return 0;
}

bool IsPopOrder(const int* pPush, const int* pPop, int nLenght) {
  bool bPossible = false;

  if (nullptr != pPush && nullptr != pPop && nLenght > 0) {
    const int* pNextPush = pPush;
    const int* pNextPop = pPop;
    
    std::stack<int> stackData;

    while (pNextPop - pPop < nLenght) {
      while (stackData.empty() || stackData.top() != *pNextPop) {
        if (pNextPush - pPush == nLenght) {
          break;
        }

        stackData.push(*pNextPush);
        pNextPush++;
      }
      
      if (stackData.top() != *pNextPop) {
        break;
      }

      stackData.pop();
      pNextPop++;
    }

    if (stackData.empty() && (pNextPop - pPop == nLenght)) {
      bPossible = true;
    }
  }
  
  return bPossible;
}
