// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: swift.flex

import java_cup.runtime.*;


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
class Yylex implements java_cup.runtime.Scanner {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\25\u0100\1\u0200\11\u0100\1\u0300\17\u0100\1\u0400\247\u0100"+
    "\10\u0500\u1020\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\2\3\1\4\22\0\1\1\1\5"+
    "\4\0\1\6\1\0\1\7\1\10\1\11\1\12\1\13"+
    "\1\14\1\15\1\16\12\17\1\20\1\21\1\22\1\23"+
    "\1\24\2\0\3\25\1\26\4\25\1\27\21\25\1\30"+
    "\1\31\1\32\1\31\1\25\1\31\1\33\1\34\1\25"+
    "\1\35\1\36\1\37\1\25\1\40\1\41\2\25\1\42"+
    "\1\25\1\43\1\44\1\45\1\25\1\46\1\47\1\50"+
    "\1\51\1\52\1\53\3\25\1\54\1\55\1\56\7\0"+
    "\1\3\32\0\1\1\u01df\0\1\1\177\0\13\1\35\0"+
    "\2\3\5\0\1\1\57\0\1\1\240\0\1\1\377\0"+
    "\u0100\57";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1536];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\2\1\2\2\1\3\1\1\1\4\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\3\21\1\22\1\23\10\21\1\24\1\1"+
    "\1\25\4\0\1\26\1\27\1\0\1\1\1\0\1\13"+
    "\1\30\1\31\1\32\1\33\1\34\3\21\1\35\2\21"+
    "\1\36\4\21\1\37\2\0\1\1\1\40\1\21\1\41"+
    "\1\21\1\42\1\43\1\21\1\44\1\21\1\0\1\1"+
    "\1\21\1\45\1\0\1\21\1\0\1\21\1\0\2\30"+
    "\1\21\2\46\1\0\1\47\1\50\1\30\1\51\1\46"+
    "\2\0\1\52\10\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[108];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\60\0\140\0\220\0\300\0\300\0\360\0\u0120"+
    "\0\u0150\0\220\0\220\0\220\0\220\0\220\0\220\0\u0180"+
    "\0\u01b0\0\220\0\u01e0\0\u0210\0\u0240\0\u0270\0\u02a0\0\u02d0"+
    "\0\u0300\0\220\0\220\0\u0330\0\u0360\0\u0390\0\u03c0\0\u03f0"+
    "\0\u0420\0\u0450\0\u0480\0\220\0\u04b0\0\220\0\u04e0\0\300"+
    "\0\140\0\u0510\0\u0510\0\300\0\u0540\0\u0570\0\u05a0\0\u05d0"+
    "\0\300\0\u0510\0\300\0\u0510\0\u0510\0\u0600\0\u0630\0\u0660"+
    "\0\u0600\0\u0690\0\u06c0\0\u0600\0\u06f0\0\u0720\0\u0750\0\u0780"+
    "\0\300\0\u07b0\0\u07e0\0\u0810\0\u05a0\0\u0840\0\u0600\0\u0870"+
    "\0\u0600\0\u08a0\0\u08d0\0\u0900\0\u0930\0\u0960\0\u0990\0\u09c0"+
    "\0\u0600\0\u09f0\0\u0a20\0\u0a50\0\u0a80\0\u0960\0\u0ab0\0\u0ae0"+
    "\0\u0b10\0\u0b40\0\u0b70\0\u0ba0\0\u0600\0\u0600\0\u0bd0\0\u0600"+
    "\0\u0c00\0\u0c30\0\u0c60\0\u0c30\0\u0c90\0\u0cc0\0\u0cf0\0\u0d20"+
    "\0\u0d50\0\u0d80\0\u0db0\0\u0de0";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[108];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\4\1\5\1\6\1\5\1\7\1\10\1\11\1\12"+
    "\1\13\1\14\1\15\1\16\1\17\1\4\1\20\1\21"+
    "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
    "\1\32\1\4\1\33\2\27\1\34\1\35\1\36\1\27"+
    "\1\37\1\40\2\27\1\41\4\27\1\42\1\43\1\44"+
    "\1\45\1\46\1\4\42\0\1\47\15\0\17\50\1\51"+
    "\5\50\3\3\3\0\21\3\4\50\23\0\1\52\116\0"+
    "\1\6\100\0\1\53\42\0\1\54\14\0\1\52\45\0"+
    "\1\55\4\0\1\56\4\0\1\52\51\0\1\57\1\0"+
    "\1\60\3\0\1\52\44\0\1\61\12\0\1\52\57\0"+
    "\1\62\34\0\1\63\4\0\16\63\1\64\34\63\23\0"+
    "\1\65\53\0\1\66\3\0\1\52\1\0\3\66\3\0"+
    "\21\66\23\0\1\66\3\0\1\52\1\0\3\66\3\0"+
    "\11\66\1\67\7\66\23\0\1\66\3\0\1\52\1\0"+
    "\3\66\3\0\10\66\1\70\10\66\23\0\1\66\3\0"+
    "\1\52\1\0\3\66\3\0\11\66\1\71\7\66\23\0"+
    "\1\66\3\0\1\52\1\0\3\66\3\0\7\66\1\72"+
    "\11\66\23\0\1\66\3\0\1\52\1\0\3\66\3\0"+
    "\11\66\1\73\7\66\23\0\1\66\3\0\1\52\1\0"+
    "\3\66\3\0\4\66\1\74\14\66\23\0\1\66\3\0"+
    "\1\52\1\0\3\66\3\0\3\66\1\75\15\66\23\0"+
    "\1\66\3\0\1\52\1\0\3\66\3\0\13\66\1\76"+
    "\5\66\23\0\1\66\3\0\1\52\1\0\3\66\3\0"+
    "\1\77\20\66\23\0\1\66\3\0\1\52\1\0\3\66"+
    "\3\0\5\66\1\100\13\66\27\0\1\52\31\0\1\101"+
    "\40\0\1\102\21\0\1\63\4\0\53\63\11\55\1\103"+
    "\46\55\2\56\1\104\1\0\1\104\52\56\20\0\1\105"+
    "\55\0\1\57\1\0\1\60\57\0\1\66\5\0\3\66"+
    "\3\0\21\66\23\0\1\66\5\0\3\66\3\0\16\66"+
    "\1\106\2\66\23\0\1\66\5\0\3\66\3\0\15\66"+
    "\1\107\3\66\23\0\1\66\5\0\3\66\3\0\14\66"+
    "\1\110\4\66\23\0\1\66\5\0\3\66\3\0\13\66"+
    "\1\111\5\66\23\0\1\66\5\0\3\66\3\0\15\66"+
    "\1\112\3\66\23\0\1\66\5\0\3\66\3\0\6\66"+
    "\1\113\12\66\23\0\1\66\5\0\3\66\3\0\13\66"+
    "\1\114\5\66\23\0\1\66\5\0\3\66\3\0\6\66"+
    "\1\115\12\66\54\0\1\116\7\0\11\55\1\103\4\55"+
    "\1\117\41\55\2\0\1\104\1\0\1\104\50\0\1\104"+
    "\21\0\1\66\5\0\3\66\3\0\1\66\1\120\17\66"+
    "\23\0\1\66\5\0\3\66\3\0\3\66\1\121\15\66"+
    "\5\0\4\122\12\0\1\66\5\0\3\66\3\0\21\66"+
    "\23\0\1\66\5\0\3\66\3\0\10\66\1\123\10\66"+
    "\5\0\4\124\12\0\1\66\5\0\3\66\3\0\21\66"+
    "\23\0\1\66\5\0\3\66\3\0\7\66\1\125\11\66"+
    "\5\0\4\126\53\0\2\127\3\55\4\127\1\130\45\127"+
    "\1\55\17\0\1\66\5\0\3\66\3\0\7\66\1\131"+
    "\11\66\4\0\1\132\4\133\20\132\3\134\3\0\21\134"+
    "\4\132\17\0\1\66\5\0\3\66\3\0\15\66\1\135"+
    "\3\66\5\0\4\124\20\0\3\134\3\0\21\134\23\0"+
    "\1\66\5\0\3\66\3\0\3\66\1\136\15\66\4\0"+
    "\1\55\4\127\4\55\1\103\43\55\1\137\3\55\4\127"+
    "\4\55\1\103\4\55\1\117\36\55\1\137\2\55\17\0"+
    "\1\66\5\0\3\66\3\0\3\66\1\140\15\66\23\0"+
    "\1\132\5\0\3\132\3\0\21\132\4\0\1\132\4\133"+
    "\20\132\3\141\3\0\21\141\4\132\1\142\4\0\12\142"+
    "\1\134\1\143\2\142\1\144\1\142\3\134\3\142\21\134"+
    "\4\142\2\55\1\137\1\55\1\137\4\55\1\103\43\55"+
    "\1\137\2\55\1\142\4\0\12\142\1\141\1\143\2\142"+
    "\1\144\1\142\3\141\3\142\21\141\5\142\4\0\16\142"+
    "\1\144\35\142\4\145\16\142\1\144\34\142\1\0\4\145"+
    "\21\0\1\146\1\147\74\0\1\150\56\0\1\151\65\0"+
    "\1\152\56\0\1\142\43\0\1\153\65\0\1\154\53\0"+
    "\1\142\21\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3600];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\3\0\1\1\2\11\40\1\1\0\1\11\1\1\1\0"+
    "\1\1\1\11\1\0\1\1\1\0\1\1\1\11\1\1"+
    "\1\11\15\1\1\11\2\0\12\1\1\0\3\1\1\0"+
    "\1\1\1\0\7\1\1\0\5\1\2\0\1\1\10\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[108];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** For the backwards DFA of general lookahead statements */
  private boolean [] zzFin = new boolean [ZZ_BUFFERSIZE+1];

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Yylex(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
  yyclose();    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  @Override  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { 
            }
            // fall through
          case 43: break;
          case 2:
            { return new Symbol(sym.EOL);
            }
            // fall through
          case 44: break;
          case 3:
            { return new Symbol(sym.NO);
            }
            // fall through
          case 45: break;
          case 4:
            { return new Symbol(sym.AP);
            }
            // fall through
          case 46: break;
          case 5:
            { return new Symbol(sym.CP);
            }
            // fall through
          case 47: break;
          case 6:
            { return new Symbol(sym.MUL);
            }
            // fall through
          case 48: break;
          case 7:
            { return new Symbol(sym.SUM);
            }
            // fall through
          case 49: break;
          case 8:
            { return new Symbol(sym.COMA);
            }
            // fall through
          case 50: break;
          case 9:
            { return new Symbol(sym.RES);
            }
            // fall through
          case 51: break;
          case 10:
            { return new Symbol(sym.DIV);
            }
            // fall through
          case 52: break;
          case 11:
            { return new Symbol(sym.NUM, new Integer(yytext()));
            }
            // fall through
          case 53: break;
          case 12:
            { return new Symbol(sym.PP);
            }
            // fall through
          case 54: break;
          case 13:
            { return new Symbol(sym.PYC);
            }
            // fall through
          case 55: break;
          case 14:
            { return new Symbol(sym.LT);
            }
            // fall through
          case 56: break;
          case 15:
            { return new Symbol(sym.IGUAL);
            }
            // fall through
          case 57: break;
          case 16:
            { return new Symbol(sym.GT);
            }
            // fall through
          case 58: break;
          case 17:
            { return new Symbol(sym.IDENT, yytext());
            }
            // fall through
          case 59: break;
          case 18:
            { return new Symbol(sym.AC);
            }
            // fall through
          case 60: break;
          case 19:
            { return new Symbol(sym.CC);
            }
            // fall through
          case 61: break;
          case 20:
            { return new Symbol(sym.AL);
            }
            // fall through
          case 62: break;
          case 21:
            { return new Symbol(sym.CL);
            }
            // fall through
          case 63: break;
          case 22:
            { return new Symbol(sym.NE);
            }
            // fall through
          case 64: break;
          case 23:
            { return new Symbol(sym.AND);
            }
            // fall through
          case 65: break;
          case 24:
            { System.out.format("error");System.exit(0);
            }
            // fall through
          case 66: break;
          case 25:
            { return new Symbol(sym.LE);
            }
            // fall through
          case 67: break;
          case 26:
            // lookahead expression with fixed base length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL, zzStartRead, zzEndRead - zzStartRead, zzStartRead, 1);
            { System.out.format("error");System.exit(0);
            }
            // fall through
          case 68: break;
          case 27:
            { return new Symbol(sym.EQ);
            }
            // fall through
          case 69: break;
          case 28:
            { return new Symbol(sym.GE);
            }
            // fall through
          case 70: break;
          case 29:
            { return new Symbol(sym.DO);
            }
            // fall through
          case 71: break;
          case 30:
            { return new Symbol(sym.IF);
            }
            // fall through
          case 72: break;
          case 31:
            { return new Symbol(sym.OR);
            }
            // fall through
          case 73: break;
          case 32:
            { return new Symbol(sym.DOUBLE, new Double(yytext()));
            }
            // fall through
          case 74: break;
          case 33:
            { return new Symbol(sym.INT_TYPE);
            }
            // fall through
          case 75: break;
          case 34:
            { return new Symbol(sym.FOR);
            }
            // fall through
          case 76: break;
          case 35:
            { return new Symbol(sym.LET);
            }
            // fall through
          case 77: break;
          case 36:
            { return new Symbol(sym.VAR);
            }
            // fall through
          case 78: break;
          case 37:
            { return new Symbol(sym.ELSE);
            }
            // fall through
          case 79: break;
          case 38:
            // general lookahead, find correct zzMarkedPos
            { int zzFState = 1;
              int zzFPos = zzStartRead;
              if (zzFin.length <= zzBufferL.length) {
                zzFin = new boolean[zzBufferL.length+1];
              }
              boolean zzFinL[] = zzFin;
              while (zzFState != -1 && zzFPos < zzMarkedPos) {
                zzFinL[zzFPos] = ((zzAttrL[zzFState] & 1) == 1);
                zzInput = Character.codePointAt(zzBufferL, zzFPos, zzMarkedPos);
                zzFPos += Character.charCount(zzInput);
                zzFState = zzTransL[ zzRowMapL[zzFState] + zzCMap(zzInput) ];
              }
              if (zzFState != -1) {
                zzFinL[zzFPos++] = ((zzAttrL[zzFState] & 1) == 1);
              }
              while (zzFPos <= zzMarkedPos) {
                zzFinL[zzFPos++] = false;
              }

              zzFState = 2;
              zzFPos = zzMarkedPos;
              while (!zzFinL[zzFPos] || (zzAttrL[zzFState] & 1) != 1) {
                zzInput = Character.codePointBefore(zzBufferL, zzFPos, zzStartRead);
                zzFPos -= Character.charCount(zzInput);
                zzFState = zzTransL[ zzRowMapL[zzFState] + zzCMap(zzInput) ];
              };
              zzMarkedPos = zzFPos;
            }
            { System.out.format("error");System.exit(0);
            }
            // fall through
          case 80: break;
          case 39:
            { return new Symbol(sym.PRINT);
            }
            // fall through
          case 81: break;
          case 40:
            { return new Symbol(sym.WHILE);
            }
            // fall through
          case 82: break;
          case 41:
            { return new Symbol(sym.DOUBLE_TYPE);
            }
            // fall through
          case 83: break;
          case 42:
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL, zzStartRead, zzEndRead - zzStartRead, zzMarkedPos, -1);
            { System.out.format("error");System.exit(0);
            }
            // fall through
          case 84: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
