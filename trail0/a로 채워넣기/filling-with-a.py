text = input()
chars = list(text)

chars[1] = 'a';
chars[-2] = 'a';

newText = "".join(chars);
print(newText)