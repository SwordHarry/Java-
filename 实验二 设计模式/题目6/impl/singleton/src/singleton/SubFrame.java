package singleton;

		import javax.swing.JFrame;
		import javax.swing.JInternalFrame;
		import javax.swing.JPanel;

// �����Ӵ���
public class SubFrame extends JInternalFrame {

	private static JPanel contentPane;

	private static volatile SubFrame subFrame = null;

	private SubFrame(String str) {
		super(str);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(51, 33, 210, 89);
		setVisible(true);
	}

	public static SubFrame getSubFrame() {

		if(subFrame == null) {
			synchronized (SubFrame.class) {
				if(subFrame == null){
					subFrame = new SubFrame("�Ӵ���");
				}
			}
		}

		return subFrame;
	}

}
