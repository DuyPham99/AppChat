import { Grid } from '@mui/material';
import { makeStyles } from '@mui/styles';
import './App.css';
import MainChat from './features/MainChat';
import MenuOptions from './features/MenuOptions';
import RoomsChat from './features/RoomsChat/pages';

const useStyle = makeStyles({
    outterColumn: {
        height: "95vh",
        borderRight: "1px solid #ded7d7",
        borderLeft: "1px solid #ded7d7"
    }
})

const App = () => {
    const styles = useStyle();

    return (
            <Grid container pt={3} nowrap>
                <Grid item xs={3}>
                    <RoomsChat></RoomsChat>
                </Grid>
                <Grid item xs={6} className={styles.outterColumn}>
                    <MainChat></MainChat>
                </Grid>
                <Grid item xs={3}>
                    <MenuOptions></MenuOptions>
                </Grid>
            </Grid>
    )
}

export default App;
