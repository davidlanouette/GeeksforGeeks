package main

import (
	"testing"

	"github.com/stretchr/testify/assert"
)

func TestIsValidIPAddress(t *testing.T) {
	assert.True(t, isValidIPAddress("128.0.0.1"))
	assert.True(t, isValidIPAddress("125.16.100.1"))
	assert.False(t, isValidIPAddress("125.512.100.1"))
	assert.False(t, isValidIPAddress("125.512.100.abc"))
	assert.False(t, isValidIPAddress("google.com"))
}
