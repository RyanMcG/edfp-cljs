# edfo
## **ed**it **f**ile **o**bjects

## Usage

```bash
ls | edfo
```

*edfo* reads stdin, assumes each line is a path to file object (file or
directory) and allows for easy manipulation of those objects.

1. Changing the name of the file will rename it.
2. Clearing the line will delete it.

### Example

```bash
$ mkdir playground && cd playground
$ touch a b c
$ ls
a b c
$ ls | edfo
```
VISUAL will be opened with each line representing a file path:

```
a
b
c
```

Let's say you edit it to this:

```
x

y
```

Write and quit your editor, then try `ls` again.

```bash
$ ls
x y
```

You renamed a → x and c → y and deleted b. Good job!

## License

MIT. See LICENSE.
