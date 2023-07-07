with open('mytext.txt', 'w') as f:
  f.write('Hello world!\n')
  f.write('This is my text file.\n')
  f.write('And this is yet another line in this text file.\n')
  f.write('Okay, I’m done now, have nice day.\n')

with open('mytext.txt', 'r+') as f:
  print(f.readline().strip('\n'))
  print(f.readline())
  f.write('Yet another added line\n')

with open('mytext.txt', 'r') as f:
  print(f.read())