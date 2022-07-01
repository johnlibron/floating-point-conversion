package com.computer.organization;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class SinglePrecisionFrame {

	private JFrame frmFloatingPointSingle;
	private JTextField txtNumber;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SinglePrecisionFrame window = new SinglePrecisionFrame();
					window.frmFloatingPointSingle.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SinglePrecisionFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFloatingPointSingle = new JFrame();
		frmFloatingPointSingle.setTitle("IEEE-754 Floating Point Format (Single Precision)");
		frmFloatingPointSingle.setBounds(100, 100, 510, 685);
		frmFloatingPointSingle.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFloatingPointSingle.getContentPane().setLayout(null);
		
		JRadioButton rdbtnDecimalToBinary = new JRadioButton("Decimal to Binary");
		rdbtnDecimalToBinary.setSelected(true);
		buttonGroup.add(rdbtnDecimalToBinary);
		rdbtnDecimalToBinary.setBounds(6, 7, 126, 23);
		frmFloatingPointSingle.getContentPane().add(rdbtnDecimalToBinary);
		
		JRadioButton rdbtnBinaryToDecimal = new JRadioButton("Binary to Decimal");
		buttonGroup.add(rdbtnBinaryToDecimal);
		rdbtnBinaryToDecimal.setBounds(134, 7, 126, 23);
		frmFloatingPointSingle.getContentPane().add(rdbtnBinaryToDecimal);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.setBounds(366, 7, 104, 23);
		frmFloatingPointSingle.getContentPane().add(btnConvert);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(366, 36, 104, 23);
		frmFloatingPointSingle.getContentPane().add(btnClear);
		
		txtNumber = new JTextField();
		txtNumber.setBounds(10, 37, 330, 20);
		frmFloatingPointSingle.getContentPane().add(txtNumber);
		txtNumber.setColumns(10);
		
		JPanel panelDecimalToBinary = new JPanel();
		panelDecimalToBinary.setBounds(10, 68, 458, 243);
		panelDecimalToBinary.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		frmFloatingPointSingle.getContentPane().add(panelDecimalToBinary);
		panelDecimalToBinary.setLayout(null);
		
		JPanel panelBinaryToDecimal = new JPanel();
		panelBinaryToDecimal.setBounds(10, 325, 458, 300);
		panelBinaryToDecimal.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		frmFloatingPointSingle.getContentPane().add(panelBinaryToDecimal);
		panelBinaryToDecimal.setLayout(null);
		
		JLabel lblFive = new JLabel("Floating Point Format:");
		lblFive.setBounds(10, 36, 130, 14);
		panelBinaryToDecimal.add(lblFive);
		
		JLabel lblSignBit1 = new JLabel("");
		lblSignBit1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSignBit1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		lblSignBit1.setBounds(10, 55, 24, 22);
		panelBinaryToDecimal.add(lblSignBit1);
		
		JLabel lblExponent1 = new JLabel("");
		lblExponent1.setHorizontalAlignment(SwingConstants.CENTER);
		lblExponent1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		lblExponent1.setBounds(33, 55, 67, 22);
		panelBinaryToDecimal.add(lblExponent1);
		
		JLabel lblMantissa1 = new JLabel("");
		lblMantissa1.setHorizontalAlignment(SwingConstants.CENTER);
		lblMantissa1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		lblMantissa1.setBounds(99, 55, 178, 22);
		panelBinaryToDecimal.add(lblMantissa1);
		
		JLabel lblSix = new JLabel("Exponent:");
		lblSix.setBounds(10, 88, 116, 14);
		panelBinaryToDecimal.add(lblSix);
		
		JLabel lblExp = new JLabel("");
		lblExp.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		lblExp.setBounds(10, 107, 130, 22);
		panelBinaryToDecimal.add(lblExp);
		
		JLabel lblSeven = new JLabel("Normalized Mantissa:");
		lblSeven.setBounds(10, 140, 199, 14);
		panelBinaryToDecimal.add(lblSeven);
		
		JLabel lblNormalizedMantissa = new JLabel("");
		lblNormalizedMantissa.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		lblNormalizedMantissa.setBounds(10, 159, 438, 22);
		panelBinaryToDecimal.add(lblNormalizedMantissa);
		
		JLabel lblEight = new JLabel("Converted Normalized Mantissa:");
		lblEight.setBounds(10, 192, 199, 14);
		panelBinaryToDecimal.add(lblEight);
		
		JLabel lblConvertedNormalizedMantissa = new JLabel("");
		lblConvertedNormalizedMantissa.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		lblConvertedNormalizedMantissa.setBounds(10, 211, 438, 22);
		panelBinaryToDecimal.add(lblConvertedNormalizedMantissa);
		
		JLabel lblNine = new JLabel("Decimal:");
		lblNine.setBounds(10, 244, 90, 14);
		panelBinaryToDecimal.add(lblNine);
		
		JLabel lblDecimal = new JLabel("");
		lblDecimal.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		lblDecimal.setBounds(10, 263, 438, 22);
		panelBinaryToDecimal.add(lblDecimal);
		
		JLabel lblConvertBinaryToDecimal = new JLabel("Convert Binary to Decimal");
		lblConvertBinaryToDecimal.setBounds(10, 11, 475, 14);
		panelBinaryToDecimal.add(lblConvertBinaryToDecimal);
		
		JLabel lblOne = new JLabel("Binary:");
		lblOne.setBounds(10, 35, 72, 14);
		panelDecimalToBinary.add(lblOne);
		
		JLabel lblBinary = new JLabel("");
		lblBinary.setBounds(10, 54, 436, 22);
		lblBinary.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panelDecimalToBinary.add(lblBinary);
		
		JLabel lblTwo = new JLabel("Normalize:");
		lblTwo.setBounds(10, 87, 90, 14);
		panelDecimalToBinary.add(lblTwo);
		
		JLabel lblNormalize = new JLabel("");
		lblNormalize.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		lblNormalize.setBounds(10, 106, 436, 22);
		panelDecimalToBinary.add(lblNormalize);
		
		JLabel lblThree = new JLabel("Biased Exponent:");
		lblThree.setBounds(10, 139, 116, 14);
		panelDecimalToBinary.add(lblThree);
		
		JLabel lblBiasedExponent = new JLabel("");
		lblBiasedExponent.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		lblBiasedExponent.setBounds(10, 158, 130, 22);
		panelDecimalToBinary.add(lblBiasedExponent);
		
		JLabel lblFour = new JLabel("Floating Point Format:");
		lblFour.setBounds(10, 191, 130, 14);
		panelDecimalToBinary.add(lblFour);
		
		JLabel lblSignBit = new JLabel("");
		lblSignBit.setHorizontalAlignment(SwingConstants.CENTER);
		lblSignBit.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		lblSignBit.setBounds(10, 210, 24, 22);
		panelDecimalToBinary.add(lblSignBit);
		
		JLabel lblExponent = new JLabel("");
		lblExponent.setHorizontalAlignment(SwingConstants.CENTER);
		lblExponent.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		lblExponent.setBounds(33, 210, 67, 22);
		panelDecimalToBinary.add(lblExponent);
		
		JLabel lblMantissa = new JLabel("");
		lblMantissa.setHorizontalAlignment(SwingConstants.CENTER);
		lblMantissa.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		lblMantissa.setBounds(99, 210, 178, 22);
		panelDecimalToBinary.add(lblMantissa);
		
		JLabel lblConvertDecimalToBinary = new JLabel("Convert Decimal to Binary");
		lblConvertDecimalToBinary.setBounds(10, 11, 476, 14);
		panelDecimalToBinary.add(lblConvertDecimalToBinary);
		
		btnConvert.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String number = txtNumber.getText().trim();
				
				if (!number.equals("")) {					
					if (rdbtnDecimalToBinary.isSelected()) {
						try {
							String signBit = "";
							String binary = "";
							String normalize = "";
							String exponent = "";
							String mantissa = "";
							
							int integer = 0;
							float fractional = 0.0f;
							
							if (number.contains(".")) {
								String[] numberParts = number.split("\\.");
								integer = Integer.parseInt(numberParts[0]);
								fractional = Float.parseFloat("0." + numberParts[1]);
							} else {
								integer = Integer.parseInt(txtNumber.getText().trim());
							}
							
							// get sign bit
							signBit = getSignBit(integer);
							
							// absolute value of the decimal
							integer = Math.abs(integer);
							
							// convert decimal to binary
							binary = convertDecimalToBinary(integer, fractional);
							lblBinary.setText(binary + " base 2");
							
							// normalize the binary
							int power = getNormalizeBasePower(binary);
							normalize = normalizeBinary(binary);
							lblNormalize.setText(normalize + " base 2 × 2 to the power of " + power);
							
							// get exponent
							exponent = getExponent(power);
							lblBiasedExponent.setText(exponent + " base 2");
							
							// get mantissa
							mantissa = getMantissa(normalize);
							
							lblSignBit.setText(signBit);
							lblExponent.setText(exponent);
							lblMantissa.setText(mantissa);
							
							lblConvertDecimalToBinary.setText("Convert Decimal to Binary: " + number);
						} catch (Exception e) {
							lblBinary.setText("");
							lblNormalize.setText("");
							lblBiasedExponent.setText("");
							lblSignBit.setText("");
							lblExponent.setText("");
							lblMantissa.setText("");
							JOptionPane.showMessageDialog(frmFloatingPointSingle, "Invalid input number.");
						}
					} else if (rdbtnBinaryToDecimal.isSelected()) {
						try {
							if (number.length() == 32) {
								if (isBinary(number)) {
									String signBit = "";
									String exponent = "";
									String mantissa = "";
									
									signBit = number.substring(0, 1);
									exponent = number.substring(1, 9);
									mantissa = number.substring(9, 32);
									
									// set floating point format
									lblSignBit1.setText(signBit);
									lblExponent1.setText(exponent);
									lblMantissa1.setText(mantissa);
									
									// get exponent
									int exp = Integer.parseInt(exponent, 2) - 127;
									
									// set exponent
									lblExp.setText("" + exp);
									
									// remove zeroes in the end in mantissa
									mantissa = removeZeroesInMantissa(mantissa);
									
									String normalizedMantissa = "1." + mantissa;
									
									// set normalized mantissa
									lblNormalizedMantissa.setText(normalizedMantissa);
									
									// get the values of the normalized mantissa
									int placesAfterPoint = normalizedMantissa.length() - normalizedMantissa.indexOf(".") - 1;
									long numerator = Long.parseLong(normalizedMantissa.replace(".", ""), 2);
									double value = ((double) numerator) / (1L << placesAfterPoint);
									
									// set the total values of normalized mantissa
									lblConvertedNormalizedMantissa.setText(value + " base 2 × 2 to the power of " + exp);
									
									// convert value to decimal
									lblDecimal.setText(addSignBit(Integer.parseInt(signBit), value, exp));
									
									lblConvertBinaryToDecimal.setText("Convert Binary to Decimal: " + number);
								} else {
									JOptionPane.showMessageDialog(frmFloatingPointSingle, "Input number should have 1 or 0.");
								}
							} else {
								JOptionPane.showMessageDialog(frmFloatingPointSingle, "Input 32 numbers.");
							}
						} catch (Exception e) {
							lblSignBit1.setText("");
							lblExponent1.setText("");
							lblMantissa1.setText("");
							lblExp.setText("");
							lblNormalizedMantissa.setText("");
							lblConvertedNormalizedMantissa.setText("");
							lblDecimal.setText("");
							JOptionPane.showMessageDialog(frmFloatingPointSingle, "Invalid input number.");
						}
					}
				} else {
					JOptionPane.showMessageDialog(frmFloatingPointSingle, "Please input number in the textbox.");
				}
			}
		});

		btnClear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				txtNumber.setText("");
				
				lblConvertDecimalToBinary.setText("Convert Decimal to Binary");
				lblBinary.setText("");
				lblNormalize.setText("");
				lblBiasedExponent.setText("");
				lblSignBit.setText("");
				lblExponent.setText("");
				lblMantissa.setText("");
				
				lblConvertBinaryToDecimal.setText("Convert Binary to Decimal");
				lblSignBit1.setText("");
				lblExponent1.setText("");
				lblMantissa1.setText("");
				lblExp.setText("");
				lblNormalizedMantissa.setText("");
				lblConvertedNormalizedMantissa.setText("");
				lblDecimal.setText("");
			}
		});
	}
	
	private String getSignBit(int integer) {
		if (integer >= 0) {
			return "0";
		} else {
			return "1";
		}
	}
	
	private String convertDecimalToBinary(int integer, double fractional) {
		String binaryInteger = Integer.toBinaryString(integer);
		String binaryFractional = "";
		int counter = 10;
		
		if (fractional > 0) {
			while (fractional > 0) {
				fractional *= 2;
				integer = (int) fractional;
				fractional -= integer;
				binaryFractional += integer;
				if (binaryFractional.length() == counter) {
					break;
				}
			}
			return binaryInteger + "." + binaryFractional;
		} else {
			return binaryInteger;
		}
	}
	
	private String normalizeBinary(String binary) {
		String ones = "";
		String normalize = "";
		if (binary.contains(".")) {
			String[] binaryParts = binary.split("\\.");
			if (!binaryParts[0].equals("0")) {
				ones = binaryParts[0].substring(0, 1);
				normalize = ones + "." + binaryParts[0].substring(1, binaryParts[0].length()) + binaryParts[1];
			} else {
				normalize = binaryParts[1];
				while (normalize.charAt(0) == '0') {
					normalize = normalize.substring(1, normalize.length());
				}
				ones = normalize.substring(0, 1);
				normalize = ones + "." + normalize.substring(1, normalize.length());
			}
		} else {
			ones = binary.substring(0, 1);
			normalize = ones + "." + binary.substring(1, binary.length());
		}
		
		// remove 0s in the last binary
		while (normalize.charAt(normalize.length() - 1) == '0') {
			normalize = normalize.substring(0, normalize.length() - 1);
		}
		
		return normalize;
	}
	
	private int getNormalizeBasePower(String binary) {
		if (binary.contains(".")) {
			String[] binaryParts = binary.split("\\.");
			if (!binaryParts[0].equals("0")) {
				return binaryParts[0].length() - 1;
			} else {
				String normalize = binaryParts[1];
				int counter = 1;
				while (normalize.charAt(0) == '0') {
					normalize = normalize.substring(1, normalize.length());
					counter++;
				}
				return counter *= -1;
			}
		} else {
			return binary.length() - 1;
		}
	}
	
	private String getExponent(int power) {
		String binary = Integer.toBinaryString(power + 127);
		if (binary.length() != 8) {
			for (int i = binary.length(); i < 8; i++) {
				binary = "0" + binary;
			}
		}
		return binary;
	}
	
	private String getMantissa(String normalize) {
		String mantissa = normalize.split("\\.")[1];
		for (int i = mantissa.length(); i < 23; i++) {
			mantissa += "0";
		}
		mantissa = mantissa.substring(0, 23);
		return mantissa;
	}
	
	private String addSignBit(int signBit, double value, int exponent) {
		String decimal = "" + value * Math.pow(2, exponent);
		return signBit == 1 ? "-" + decimal : decimal;
	}
	
	private boolean isBinary(String number) {
		for (int i = 0; i < number.length(); i++) {
			if (number.charAt(i) != '0' && number.charAt(i) != '1') {
				return false;
			}
		}
		return true;
	}
	
	private String removeZeroesInMantissa(String mantissa) {
		while (mantissa.endsWith("0") && mantissa.length() > 1) {
			mantissa = mantissa.substring(0, mantissa.length() - 1);
		}
		return mantissa;
	}
}