#include <stdio.h>
#include <string.h>
#pragma warning(disable : 4996)

int main(void)
{
	int inputDataT;
	char bracket[50];

	scanf("%d", &inputDataT);

	for (int i = 0; i < inputDataT; i++) {
		int cnt = 0;
		scanf("%s", bracket);

		for (int j = 0; j < strlen(bracket); j++) {
			if (bracket[j] == '(') {
				cnt++;
			}
			else {
				cnt--;
			}

			if (cnt < 0) {
				printf("NO\n");
				break;
			}
		}

		if (cnt == 0) {
			printf("YES\n");
		}
		else if (cnt > 0) {
			printf("NO\n");
		}

	}
	return 0;
}