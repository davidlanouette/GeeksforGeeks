package main

import (
	"fmt"
	"strconv"
	"strings"
)

func main() {
	fmt.Println("Hello")
}

func isValidIPAddress(ip string) bool {

	parts := strings.Split(ip, ".")
	if len(parts) != 4 {
		return false
	}

	for _, p := range parts {
		num, err := strconv.Atoi(p)
		if err != nil {
			return false
		}
		if num < 0 || num > 255 {
			return false
		}
	}
	return true
}
