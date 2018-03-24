package com.kancrus.mediville

import javax.swing.JPanel
import java.awt.Dimension

class GamePanel() : JPanel(), KeyListener, Runnable {
	val serialVersionUID = 1L
	
	val WIDTH = 900
	val HEIGHT = 550
	
	var thread: Thread? = null
	var isRunning = false
	
	init {
		super.setPreferredSize(Dimension(WIDTH, HEIGHT))
		
		start()
	}
	
	private fun start() {
		isRunning = true
		
		thread = Thread(this)
		thread!!.start()
	}
	
	fun run() {
		
	}
	
}