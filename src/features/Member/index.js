import FolderIcon from '@mui/icons-material/Folder';
import { Avatar } from '@mui/material';
import Grid from '@mui/material/Grid';
import List from '@mui/material/List';
import ListItem from '@mui/material/ListItem';
import ListItemIcon from '@mui/material/ListItemIcon';
import ListItemText from '@mui/material/ListItemText';
import { styled } from '@mui/material/styles';
import Typography from '@mui/material/Typography';
import * as React from 'react';

const Demo = styled('div')(({ theme }) => ({
    backgroundColor: theme.palette.background.paper,
}));

function generate(element) {
    return [0, 1, 2].map((value) =>
        React.cloneElement(element, {
            key: value,
        }),
    );
}

const Member = (pros) => {
    const [dense, setDense] = React.useState(false);
    const [secondary, setSecondary] = React.useState(false);

    return (
        <>
            <Grid item sx={{ pl: 4 }}>
                <Demo>
                    <List dense={dense} component="div">
                        <ListItem disablePadding>
                            <ListItemIcon>
                                <Avatar alt="Remy Sharp"
                                    src="D:\Learn\app-chat\src\assets\images\avatar.png"
                                    sx={{ width: 35, height: 35 }}
                                />
                            </ListItemIcon>
                            <ListItemText
                                primary="Single-line item"
                                secondary={secondary ? 'Secondary text' : null}
                            />
                        </ListItem>
                    </List>
                </Demo>
            </Grid>
        </>
    )
}

export default Member;