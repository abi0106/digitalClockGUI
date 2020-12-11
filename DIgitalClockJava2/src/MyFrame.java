import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame
{
	
	Calendar calender;
	SimpleDateFormat timeFormat;
	SimpleDateFormat dateFormat;
	SimpleDateFormat dayFormat;
	JLabel timeLabel;
	JLabel dayLabel;
	JLabel dateLabel;
	String time;
	String day;
	String date;
	MyFrame()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Clock Program");
		this.setLayout(new FlowLayout());
		this.setSize(350, 300);
		this.setResizable(false);
		timeFormat=new SimpleDateFormat("hh:mm:ss a");
		dayFormat=new SimpleDateFormat("EEEE");
		dateFormat=new SimpleDateFormat("MMMMM dd, yyyy");
		
		System.out.println(time);
		timeLabel=new JLabel();
		dayLabel=new JLabel();
		dateLabel=new JLabel();
		
		timeLabel.setFont(new Font("verdana",Font.PLAIN,50));
		timeLabel.setForeground(new Color(0x00ff00));
		timeLabel.setBackground(Color.black);
		timeLabel.setOpaque(true);
		dayLabel.setFont(new Font("Ink Free",Font.PLAIN,30));
		dateLabel.setFont(new Font("Ink Free",Font.PLAIN,30));
		
		this.add(timeLabel);
		this.add(dayLabel);
		this.add(dateLabel);
		this.setVisible(true);
		
		setTime();
	}

	private void setTime() {
		// TODO Auto-generated method stub
		while(true)
		{
		
		time=timeFormat.format(Calendar.getInstance().getTime());
		timeLabel.setText(time);
		day=dayFormat.format(Calendar.getInstance().getTime());
		dayLabel.setText(day);
		date=dateFormat.format(Calendar.getInstance().getTime());
		dateLabel.setText(date);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
