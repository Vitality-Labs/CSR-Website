class test {
	public static void main(String[] args) {
		new test();
	}

	public test() {
		String output = "Hello World!\nI am learning java2 at\nNYiT CS department";

		JFrame frame = new JFrame("Test");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(10, 10, 100, 100);
		frame.setVisible(true);

		JPanel contentPanel = new JPanel();
		contentPanel.setBounds(0, 0, frame.getWidth(), frame.getHeight());
		contentPanel.setLayout(null);
		frame.add(contentPanel);

		JLabel label = new JLabel(output);
		label.setSize(contentPanel.getSize());
		contentPanel.add(label);
	}
}