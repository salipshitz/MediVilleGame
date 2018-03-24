package com.kancrus.mediville

import java.awt.BorderLayout

import javax.swing.JFrame

fun main(args: Array<String>) {
	val frame = JFrame("MediVille")
	frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
	frame.setResizable(false)
	frame.layout = BorderLayout()
	frame.add(GamePanel(), BorderLayout.CENTER)
	frame.pack()
	frame.setLocationRelativeTo(null)
	frame.setVisible(true)
}