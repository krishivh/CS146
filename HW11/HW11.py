class HW11:
    def floodFill(self, image, sr, sc, color):
            if not image or image[sr][sc] == color or sr < 0 or sc < 0 or sr >= len(image) or sc >= len(image[0]):
                return image
            self.fill(image, sr, sc, image[sr][sc], color)
            return image

    def fill(self, image, sr, sc, oldColor, color):
        if sr < 0 or sc < 0 or sr >= len(image) or sc >= len(image[0]) or image[sr][sc] != oldColor:
            return
        image[sr][sc] = color
        self.fill(image, sr-1, sc, oldColor, color)
        self.fill(image, sr+1, sc, oldColor, color)
        self.fill(image, sr, sc-1, oldColor, color)
        self.fill(image, sr, sc+1, oldColor, color)

solution = HW11()
image5 = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
sr5, sc5, color5 = 0, 0, 1
solution.floodFill (image5, sr5, sc5, color5)
print(image5)

